SUMMARY = "An integration package connecting OpenAI and LangChain"
DESCRIPTION = "This package contains the LangChain integrations for OpenAI through their \
openai SDK. \
 \
It provides chat models, LLMs, embeddings and tokenization helpers that let \
the OpenAI and Azure OpenAI services be used as components in the LangChain \
ecosystem."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python313-langchain-openai-1.6.2-1.1.noarch.rpm"
RPM_HASH = "8310dd439001416d0aecde1215cdb7c225dbc80f1da8d98d6b8c43c0aa20685d1a6c887936a9d6b8a979a0b08feeadc7fa87fc346afa0b1267b01b153a877a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langchain-openai \
python3.13dist-langchain-openai \
python313-langchain-openai \
python3dist-langchain-openai"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-langchain-core \
python313-openai \
python313-tiktoken"

inherit rpm
