SUMMARY = "The official Python SDK for the xAI API"
DESCRIPTION = "The official Python SDK for the xAI API. It provides synchronous and \
asynchronous clients for xAI's gRPC API, covering chat completions (including \
streaming, tool and function calling, and structured outputs), image \
generation, embeddings and tokenization, file and collection management, batch \
jobs, and deferred requests. Optional OpenTelemetry exporters allow tracing of \
SDK calls."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python313-xai-sdk-1.19.0-1.1.noarch.rpm"
RPM_HASH = "8fd94a002e00f112585ad3f720f06a91f37aa8035adbd4858bba6fb322662cdf304078ac08463e1c5e5e22e080e164e5a99b1a51e0930be8e1c707007dd02a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xai-sdk \
python3.13dist-xai-sdk \
python313-xai-sdk \
python3dist-xai-sdk"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-googleapis-common-protos \
python313-grpcio \
python313-opentelemetry-sdk \
python313-packaging \
python313-protobuf \
python313-pydantic \
python313-requests \
python313-typing-extensions"

inherit rpm
