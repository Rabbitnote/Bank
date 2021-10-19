# 09-Transaction and History Feature

## Frontend (Vue)

### 1. History Feature

- `/History` 

  > Showing all history of that account

- `/Graph`

  > Showing income and expense of all the year


## Backend (Servlet)

### Function

### getBalance
* **Description:** `Get the balance of that account`
* **Package:** `model.QueryModel`

### getTransactionHistory
* **Description:** `Render all history of that account`
* **Package:** `model.QueryModel`

### getCurrency
* **Description:** `Get the currency of that account (Ex. USD ,ISK ,THB)`
* **Package:** `model.QueryModel`

### getAmountWithdraw(Month) `January - December`                                                       
* **Description:** `Get the withdraw amount of that account in specific month`     
* **Package:** `model.QueryModel`

### getAmountDeposit(Month) `January - December`
* **Description:** `Get the deposit amount of that account in specific month`     
* **Package:** `model.QueryModel`



### Servlet

### - AccountServlet
 * **URL:** `/account`
 * **Method:** `Get`
 * **Auther required:** `Yes`
 * **Parameter:** `None`
 * **Body:** `None`
 
### Success Response

**Response Body:**

```json
[
 {
   "id":<String>,
   "OwnerId":<String>,
   "Account":<String>,
   "Name":<String>,
   "balance":<String>
 }
]
```

### **Error Response**
- **Status code** : `401`

    **Response Body** : None

- **Status code** : `500`

    **Response Body** : None

---

### - AllHistoryServlet
* **URL:** `/allhistory`
* **Method:** `Get`
* **Auther required:** `Yes`
* **Parameter:** `accid`
* **Body:** `None`

### Success Response

**Response Body:**

```json
{
   "Money":[double,...,double]
}
```

### **Error Response**
- **Status code** : `401`

    **Response Body** : None

- **Status code** : `500`

    **Response Body** : None

---

### - HistoryServlet
* **URL:** `/history`
* **Method:** `Get`
* **Auther required:** `Yes`
* **Parameter:** `num`
* **Body:** `None`

### Success Response

**Response Body:**

```json
[
 {
  "Date":<String>,
  "currency":<String>,
  "amount":<String>,
  "type":<String>,
  "account_id":<String>,
  "owner_id":<String>,
  "payee_id":<String>,
  "note":<String>
 }
]
```

### **Error Response**
- **Status code** : `401`

    **Response Body** : None

- **Status code** : `500`

    **Response Body** : None

---

### - WithdrawServlet
* **URL:** `/withdraw`
* **Method:** `Get`
* **Auther required:** `Yes`
* **Parameter:** `accid`
* **Body:** `None`

### Success Response

**Response Body:**

```json
{
    "MoneyWithdraw":[double,...,double]
}
```

### **Error Response**
- **Status code** : `401`

    **Response Body** : None

- **Status code** : `500`

    **Response Body** : None

---

### - CurrencyServlet
* **URL:** `/currency`
* **Method:** `Get`
* **Auther required:** `Yes`
* **Parameter:** `account_id`
* **Body:** `None`

### Success Response

**Response Body:**

```json

 {
  "currency":<String>
 }

```

### **Error Response**
- **Status code** : `401`

    **Response Body** : None

- **Status code** : `500`

    **Response Body** : None

---





 



