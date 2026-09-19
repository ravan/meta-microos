SUMMARY = "Client library for the LangSmith LLM tracing and evaluation platform"
DESCRIPTION = "LangSmith helps your team debug, evaluate, and monitor your language models and \
intelligent agents. It works with any LLM Application, including a native \
integration with the LangChain Python and LangChain JS open source libraries."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "python314-langsmith-0.12.4-1.1.noarch.rpm"
RPM_HASH = "d632aaa9e0389621ae4ef04ffcd995656e267d0d2c166e04499b610bbcf26e0d160e080b3482908ad7b09194feffe7bd2de77c1ff47fc0deb40ed2e03b4536ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langsmith \
python314-langsmith \
python3dist-langsmith"

RDEPENDS:${PN} += "python-abi \
python314-anyio \
python314-distro \
python314-httpx2 \
python314-orjson \
python314-packaging \
python314-pydantic \
python314-requests \
python314-requests-toolbelt \
python314-sniffio \
python314-typing-extensions \
python314-uuid-utils \
python314-websockets \
python314-xxhash \
python314-zstandard"

inherit rpm
