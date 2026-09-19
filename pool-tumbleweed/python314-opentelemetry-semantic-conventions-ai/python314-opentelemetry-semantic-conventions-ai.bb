SUMMARY = "OpenTelemetry Semantic Conventions Extension for Large Language Models"
DESCRIPTION = "An extension of the standard OpenTelemetry Semantic Conventions for \
generative-AI applications. It defines additional span attributes, \
metrics and enums useful for debugging and monitoring prompts, \
completions and token usage of large language models."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python314-opentelemetry-semantic-conventions-ai-0.5.2-1.1.noarch.rpm"
RPM_HASH = "8a947c7fabff6e8d45c5e3a9214b62e3aebf29916dc046d193cc8a63d90556a1b5fa5cd2bf8d1c7ace9761f09373eeac4f0d58486689b66d685d1d6b6bb8b387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-semantic-conventions-ai \
python314-opentelemetry-semantic-conventions-ai \
python3dist-opentelemetry-semantic-conventions-ai"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-sdk \
python314-opentelemetry-semantic-conventions"

inherit rpm
