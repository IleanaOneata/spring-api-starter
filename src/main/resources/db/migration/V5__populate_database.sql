INSERT INTO categories (name)
VALUES ('Fruits'),
       ('Vegetables'),
       ('Dairy'),
       ('Bakery'),
       ('Meat'),
       ('Beverages'),
       ('Snacks'),
       ('Frozen'),
       ('Pantry'),
       ('Personal Care');

INSERT INTO products (name, price, description, category_id)
VALUES ('Bananas', 0.59, 'Fresh organic bananas, sold per pound.', 1),
       ('Broccoli', 1.29, 'Fresh green broccoli crowns, locally sourced.', 2),
       ('Whole Milk', 3.49, '1 gallon of whole milk from local dairy farms.', 3),
       ('Sourdough Bread', 4.25, 'Artisan sourdough bread baked fresh daily.', 4),
       ('Chicken Breast', 6.99, 'Boneless, skinless chicken breasts per pound.', 5),
       ('Coca-Cola 12-Pack', 7.99, '12-pack of 12 oz Coca-Cola cans.', 6),
       ('Lays Classic Chips', 3.79, '10 oz bag of Lays classic salted potato chips.', 7),
       ('Frozen Pizza', 5.49, '12-inch frozen pepperoni pizza, ready to bake.', 8),
       ('Peanut Butter', 2.99, '16 oz jar of creamy peanut butter.', 9),
       ('Toothpaste', 2.49, '6 oz tube of fluoride toothpaste for daily oral care.', 10);
