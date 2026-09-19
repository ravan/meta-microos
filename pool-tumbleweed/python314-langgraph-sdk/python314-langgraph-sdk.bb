SUMMARY = "SDK for interacting with the LangGraph API"
DESCRIPTION = "The LangGraph SDK provides synchronous and asynchronous Python clients for \
interacting with the LangGraph API, exposing helpers for assistants, threads, \
runs, crons and the persistent store."
LICENSE = "MIT"

PV = "0.4.4"

RPM_NAME = "python314-langgraph-sdk-0.4.4-1.1.noarch.rpm"
RPM_HASH = "00b8ac93a6bee6d69693e3b5022ae696e13bf6a13a8d2420ca68f86cb8365a441d26678b60e2e24b9f79745b090419756834541cd73898b07951d7b03ab58906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langgraph-sdk \
python314-langgraph-sdk \
python3dist-langgraph-sdk"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-langchain-core \
python314-langchain-protocol \
python314-orjson \
python314-websockets"

inherit rpm
