SUMMARY = "An integration package connecting Chroma and LangChain"
DESCRIPTION = " \
 \
This package contains the LangChain integration with Chroma. \
 \
 \
 \
```bash \
pip install -U langchain-chroma \
``` \
 \
 \
 \
The `Chroma` class exposes the connection to the Chroma vector store. \
 \
```python \
from langchain_chroma import Chroma \
 \
embeddings = ... # use a LangChain Embeddings class \
 \
vectorstore = Chroma(embeddings=embeddings) \
```"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python314-langchain-chroma-0.1.4-1.9.noarch.rpm"
RPM_HASH = "2eaed2739e6dc5ad8f7c504bfa663730c7f7863a2aa4af8f03ebc65827302be5f8fac5e45acfe6cec5fd06f67f21e6f828a6ac5018ce6617bc48a6c640a4e805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langchain-chroma \
python314-langchain-chroma \
python3dist-langchain-chroma"

RDEPENDS:${PN} += "python-abi"

inherit rpm
