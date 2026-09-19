SUMMARY = "An integration package connecting OpenAI and LangChain"
DESCRIPTION = "This package contains the LangChain integrations for OpenAI through their \
openai SDK. \
 \
It provides chat models, LLMs, embeddings and tokenization helpers that let \
the OpenAI and Azure OpenAI services be used as components in the LangChain \
ecosystem."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python314-langchain-openai-1.6.2-1.1.noarch.rpm"
RPM_HASH = "0f3142aed0e0bbeb07f6f0cef4180172d3f1a44ba4634d0a3b0d786b34700bc536ed8f6b8e202309ebaae62dae15f992da6d27e33c9fe1a8e5695a43e6d6966c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langchain-openai \
python314-langchain-openai \
python3dist-langchain-openai"

RDEPENDS:${PN} += "python-abi \
python314-certifi \
python314-langchain-core \
python314-openai \
python314-tiktoken"

inherit rpm
