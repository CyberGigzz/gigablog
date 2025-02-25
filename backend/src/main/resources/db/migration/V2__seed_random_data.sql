DO $$
BEGIN
    FOR i IN 1..20 LOOP -- Create 20 random posts
        INSERT INTO posts (title, content, created_at)
        VALUES (
            'Random Post ' || i || ' - ' || MD5(RANDOM()::TEXT), -- Unique random title
            'Content for post ' || i || ' with random text ' || MD5(RANDOM()::TEXT), -- Random content
            CURRENT_TIMESTAMP - (RANDOM() * INTERVAL '180 days') -- Random creation date (last 6 months)
        );
    END LOOP;
END;
$$;