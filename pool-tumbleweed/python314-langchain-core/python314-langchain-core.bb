SUMMARY = "Building applications with LLMs through composability"
DESCRIPTION = "LangChain Core contains the base abstractions that power the rest of the \
LangChain ecosystem. \
 \
These abstractions are designed to be as modular and simple as possible. \
Examples of these abstractions include those for language models, document \
loaders, embedding models, vectorstores, retrievers, and more. \
 \
The benefit of having these abstractions is that any provider can implement the \
required interface and then easily be used in the rest of the LangChain \
ecosystem."
LICENSE = "MIT"

PV = "1.6.3"

RPM_NAME = "python314-langchain-core-1.6.3-1.1.noarch.rpm"
RPM_HASH = "bed3f6cfbb6dbc7760194b58d82d8e36bd80939c71f1f241b72d750e70ea60823867ef36b43495e084b70863032324d993d6c94f7af5811f777307dec27112d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langchain-core \
python314-langchain-core \
python3dist-langchain-core"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-httpx \
python314-jsonpatch \
python314-langchain-protocol \
python314-langsmith \
python314-packaging \
python314-pydantic \
python314-tenacity \
python314-typing-extensions \
python314-uuid-utils"

inherit rpm
