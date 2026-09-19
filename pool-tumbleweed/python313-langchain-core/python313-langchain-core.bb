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

RPM_NAME = "python313-langchain-core-1.6.3-1.1.noarch.rpm"
RPM_HASH = "042cd03f7e083068b18cdec7c44926f55dcdf16e68b01f6efe7519d349424ddc00bed5ba74742bb1b39ef5a0ea623f752f4545b27984fa3b094bd8173e0a90d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langchain-core \
python3.13dist-langchain-core \
python313-langchain-core \
python3dist-langchain-core"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-httpx \
python313-jsonpatch \
python313-langchain-protocol \
python313-langsmith \
python313-packaging \
python313-pydantic \
python313-tenacity \
python313-typing-extensions \
python313-uuid-utils"

inherit rpm
