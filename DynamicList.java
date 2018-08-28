
package dynamiclist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DynamicList 
    {
       private static int count = 1;
       private static int id = 1;
       class Node
       {
           private Date timestamp;
           private String data;
           private int nodeNumber;
           private String nodeId;
           private String referenceNodeId;
           private String childReferenceNodeId;
           private String genesisReferenceNodeId;
           private String HashValue; 
           private String Encryption;

           public Node(){
               
               setNodeNumber(count+1);
               setTimestamp();
               setNodeId(id+1+"");
                 }
        public String Encryption(int OwnerId, int Value, String OwnerName) 
        {
            String Cipher=this.data+""+OwnerId+""+Value+""+OwnerName;
            char ch;
            StringBuilder bi = null;
            for(int i=0;i<bi.length();i++)
            {
              ch=Cipher.charAt(i);
              ch+= ch+OwnerId;
              bi.append(ch);
              
            }
            return Cipher;
            
        }

        public void setEncryption(String Encryption) {
            this.Encryption = Encryption;
        }
       

        public String getHashValue() {
        
            
            return ""+HashValue;
        }

        public void setHashValue(String HashValue) {
            this.HashValue = HashValue;
        }

        public String getChildReferenceNodeId() {
            return childReferenceNodeId;
        }

        public void setChildReferenceNodeId(String childReferenceNodeId) {
            this.childReferenceNodeId = childReferenceNodeId;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getGenesisReferenceNodeId() {
            return genesisReferenceNodeId;
        }

        public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
            this.genesisReferenceNodeId = genesisReferenceNodeId;
        }

        public String getNodeId() {
            return nodeId;
        }

        public void setNodeId(String nodeId) {
            this.nodeId = nodeId;
        }

        public int getNodeNumber() {
            return nodeNumber;
        }

        public void setNodeNumber(int nodeNumber) {
            this.nodeNumber = nodeNumber;
        }

        public String getReferenceNodeId() {
            return referenceNodeId;
        }

        public void setReferenceNodeId(String referenceNodeId) {
            this.referenceNodeId = referenceNodeId;
        }

        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
               DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/DD HH:MM:SS");
               Date date = new Date();
               this.timestamp = dateFormat.format(date);
        }
           
           
       }
       private void MakeGenesis(Node node)
       {
           
       }
       
       public Node createNode(int OwnerId, int Value, String OwnerName)
       {
           Node node = new Node();
           node.Encryption(OwnerId,Value,OwnerName);
           if(node.nodeNumber == 1)
           {
               MakeGenesis(node);
               return node;
           }
           return node;
       }
       public void insertNode()
       {
           
       }
      public static void main(String []args)
      {
          String OwnerName;
          
      }
       
       
    }


