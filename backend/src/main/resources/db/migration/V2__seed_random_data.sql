DO $$
BEGIN
    FOR i IN 1..20 LOOP
        INSERT INTO posts (title, content, created_at, updated_at)
        VALUES (
            'Random Post ' || i || ' - ' || MD5(RANDOM()::TEXT),
            'Content for post ' || i || ' with random text ' || MD5(RANDOM()::TEXT),
            CURRENT_TIMESTAMP - (RANDOM() * INTERVAL '180 days'),
            NULL 
        );
    END LOOP;
END;
$$;

