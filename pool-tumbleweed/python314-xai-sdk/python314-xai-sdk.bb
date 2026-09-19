SUMMARY = "The official Python SDK for the xAI API"
DESCRIPTION = "The official Python SDK for the xAI API. It provides synchronous and \
asynchronous clients for xAI's gRPC API, covering chat completions (including \
streaming, tool and function calling, and structured outputs), image \
generation, embeddings and tokenization, file and collection management, batch \
jobs, and deferred requests. Optional OpenTelemetry exporters allow tracing of \
SDK calls."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python314-xai-sdk-1.19.0-1.1.noarch.rpm"
RPM_HASH = "8ba28b29299e417d85e5bf9facdaa83ccd1327ebff2f35609bfca02727183762f3546a9b9b3769119950449514f06c303a038c20edd71ac211dc3691511a9296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xai-sdk \
python314-xai-sdk \
python3dist-xai-sdk"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-googleapis-common-protos \
python314-grpcio \
python314-opentelemetry-sdk \
python314-packaging \
python314-protobuf \
python314-pydantic \
python314-requests \
python314-typing-extensions"

inherit rpm
