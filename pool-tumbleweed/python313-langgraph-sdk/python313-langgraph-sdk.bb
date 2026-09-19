SUMMARY = "SDK for interacting with the LangGraph API"
DESCRIPTION = "The LangGraph SDK provides synchronous and asynchronous Python clients for \
interacting with the LangGraph API, exposing helpers for assistants, threads, \
runs, crons and the persistent store."
LICENSE = "MIT"

PV = "0.4.4"

RPM_NAME = "python313-langgraph-sdk-0.4.4-1.1.noarch.rpm"
RPM_HASH = "1d9ec3456503b8f03564dc2274ae0421841e6101fb8f2005811474827080282373de064d6093815c0eff093b80c516cafa59f5fbc88df19d2561f6879f8bd2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langgraph-sdk \
python3.13dist-langgraph-sdk \
python313-langgraph-sdk \
python3dist-langgraph-sdk"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-langchain-core \
python313-langchain-protocol \
python313-orjson \
python313-websockets"

inherit rpm
