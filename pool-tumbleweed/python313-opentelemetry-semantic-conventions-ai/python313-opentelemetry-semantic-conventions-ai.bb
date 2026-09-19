SUMMARY = "OpenTelemetry Semantic Conventions Extension for Large Language Models"
DESCRIPTION = "An extension of the standard OpenTelemetry Semantic Conventions for \
generative-AI applications. It defines additional span attributes, \
metrics and enums useful for debugging and monitoring prompts, \
completions and token usage of large language models."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python313-opentelemetry-semantic-conventions-ai-0.5.2-1.1.noarch.rpm"
RPM_HASH = "15d6aa4cb0bc43433bd56ba0c69d08aa795fde11ffa35a7a718739e753d5a41f8f35187b2fbb0f78511c8ffee6a2d4f25725a97386956ba019c17b1549af5ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-semantic-conventions-ai \
python3.13dist-opentelemetry-semantic-conventions-ai \
python313-opentelemetry-semantic-conventions-ai \
python3dist-opentelemetry-semantic-conventions-ai"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-sdk \
python313-opentelemetry-semantic-conventions"

inherit rpm
