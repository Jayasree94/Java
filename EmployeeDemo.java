class EmployeeDemo
{   
     List<Employee> list=new ArrayList<Employee>();
     class Employee
    {
    List a=new ArrayList();
    int empid;
    String name;
    int age;

    public Employee(int empid,String name,int age)
    {
        this.empid=empid;
        this.name=name;
        this.age=age;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    } 
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        EmployeeDB ed=new EmployeeDB();
       
        list.add(new Employee(33186,"varun",23));
        list.add(new Employee(33187,"deepak",23));
        list.add(new Employee(33188,"apple",23));
        list.add(new Employee(33189,"rohan",23));
        ed.addEmployee(new Employee(28233,"java",21);
    }

    

    class EmployeeDB
    {
    public void  boolean addEmployee(Employee e)
    {
        list.add()
    }
    }
