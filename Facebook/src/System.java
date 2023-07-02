class System extends Account {

    System(String id, String password, Person person, AccountStatus status) {
        super(id, password, person, status);
    }

    public void blockMember(Member name)
    {
        name.status = DISABLED;
    }

    public void unblockMember(Member name)
    {
        name.status = ACTIVE;
    }

}
