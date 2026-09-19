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

RPM_NAME = "python313-langchain-chroma-0.1.4-1.9.noarch.rpm"
RPM_HASH = "dffe4f1c37de07267cb9798f73995664986a97b67a5648d555dc1a7b2552cd79b3b15ef52dc6fa37b534c87f0bc57b35b40ab675631bb6ec6337df2ec73117de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langchain-chroma \
python3.13dist-langchain-chroma \
python313-langchain-chroma \
python3dist-langchain-chroma"

RDEPENDS:${PN} += "python-abi"

inherit rpm
