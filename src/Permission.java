enum Permission {
    ADD {
        @Override
        public void execute(String item) {
            System.out.println("Adding item: " + item);
        }
    },
    EDIT {
        @Override
        public void execute(String item) {
            System.out.println("Editing item: " + item);
        }
    },
    DELETE {
        @Override
        public void execute(String item) {
            System.out.println("Deleting item: " + item);
        }
    },
    VIEW {
        @Override
        public void execute(String item) {
            System.out.println("Viewing item: " + item);
        }
    };

    public abstract void execute(String item);
}