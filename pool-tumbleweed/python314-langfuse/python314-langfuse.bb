SUMMARY = "A client library for accessing langfuse"
DESCRIPTION = "A client library for accessing langfuse, an open-source LLM engineering \
platform that helps teams collaboratively debug, analyze, and iterate on their \
LLM applications."
LICENSE = "MIT"

PV = "4.14.0"

RPM_NAME = "python314-langfuse-4.14.0-1.1.noarch.rpm"
RPM_HASH = "bd034cdae1524dd5e6cbb7ce5ea1270363c55e2156b1ba27ba0e6c1d2e41a7bbe068fd2f15a4d29ada8bf35d4b71095df818f8ef1b0c27df33787608b9c8df78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langfuse \
python314-langfuse \
python3dist-langfuse"

RDEPENDS:${PN} += "python-abi \
python314-backoff \
python314-httpx \
python314-opentelemetry-api \
python314-opentelemetry-exporter-otlp-proto-http \
python314-opentelemetry-sdk \
python314-packaging \
python314-pydantic \
python314-wrapt"

inherit rpm
