package paymentgateway;


/**
* paymentgateway/SecurePaymentProcessorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PaymentGatewayDefinition.idl
* Saturday, March 16, 2019 7:29:15 PM GMT
*/

public abstract class SecurePaymentProcessorPOA extends org.omg.PortableServer.Servant
 implements paymentgateway.SecurePaymentProcessorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("processPayment", new java.lang.Integer (0));
    _methods.put ("shutdown", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // paymentgateway/SecurePaymentProcessor/processPayment
       {
         String account_number = in.read_string ();
         String iban = in.read_string ();
         String amount = in.read_string ();
         String $result = null;
         $result = this.processPayment (account_number, iban, amount);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // paymentgateway/SecurePaymentProcessor/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:paymentgateway/SecurePaymentProcessor:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SecurePaymentProcessor _this() 
  {
    return SecurePaymentProcessorHelper.narrow(
    super._this_object());
  }

  public SecurePaymentProcessor _this(org.omg.CORBA.ORB orb) 
  {
    return SecurePaymentProcessorHelper.narrow(
    super._this_object(orb));
  }


} // class SecurePaymentProcessorPOA
