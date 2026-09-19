SUMMARY = "A client library for accessing langfuse"
DESCRIPTION = "A client library for accessing langfuse, an open-source LLM engineering \
platform that helps teams collaboratively debug, analyze, and iterate on their \
LLM applications."
LICENSE = "MIT"

PV = "4.14.0"

RPM_NAME = "python313-langfuse-4.14.0-1.1.noarch.rpm"
RPM_HASH = "49b11d20d54c0db234a50605a709e7bfdfa51bdf0a38e11c3908e238952c28f2a5ed861b67c61c20f4cb91487d62a4c2a60286adf056450fc059f0585fa08a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langfuse \
python3.13dist-langfuse \
python313-langfuse \
python3dist-langfuse"

RDEPENDS:${PN} += "python-abi \
python313-backoff \
python313-httpx \
python313-opentelemetry-api \
python313-opentelemetry-exporter-otlp-proto-http \
python313-opentelemetry-sdk \
python313-packaging \
python313-pydantic \
python313-wrapt"

inherit rpm
