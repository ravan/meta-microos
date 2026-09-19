SUMMARY = "Client library for the LangSmith LLM tracing and evaluation platform"
DESCRIPTION = "LangSmith helps your team debug, evaluate, and monitor your language models and \
intelligent agents. It works with any LLM Application, including a native \
integration with the LangChain Python and LangChain JS open source libraries."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "python313-langsmith-0.12.4-1.1.noarch.rpm"
RPM_HASH = "d380e56b38badf1ced720fd193a785767870a9e26bb54ffa71418337399394a442301e8b9a94795ba2d43381613625b2fb81320b0a3fa57bb9631ac962f23dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langsmith \
python3.13dist-langsmith \
python313-langsmith \
python3dist-langsmith"

RDEPENDS:${PN} += "python-abi \
python313-anyio \
python313-distro \
python313-httpx2 \
python313-orjson \
python313-packaging \
python313-pydantic \
python313-requests \
python313-requests-toolbelt \
python313-sniffio \
python313-typing-extensions \
python313-uuid-utils \
python313-websockets \
python313-xxhash \
python313-zstandard"

inherit rpm
