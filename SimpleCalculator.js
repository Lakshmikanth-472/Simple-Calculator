const firstNum=prompt("Enter the first number\n");
const secondNum=prompt("Enter the second  number\n");
const operator=prompt("enter the operation\n");
let result;
if(operator==='+')
{
    result=firstNum+secondNum;
    console.log(`Sum is ${result}`);
}
else if(operator==='-')
{
    if(firstNum>secondNum)
    {
        result=firstNum-secondNum;
        console.log(`Difference is ${result}`);
    }
    else{
        result=secondNum=firstNum;
        console.log(`Difference is ${result}`);
    }

}
else if (operator=='*')
{
    result=firstNum*secondNum;
    console.log(`Product is ${result}`);


}
else if(operator==='/')
{
    if(secondNum===0)
    {
        console.log("Divide by zero error\n");
    }
    else{
        result=firstNum/secondNum;
        console.log(`Quotient is ${result}`);
    }
}