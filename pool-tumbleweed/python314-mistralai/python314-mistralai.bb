SUMMARY = "Python Client SDK for the Mistral AI API"
DESCRIPTION = " \
 \
Before you begin, you will need a Mistral AI API key. \
 \
Mistral AI API: Our Chat Completion and Embeddings APIs specification. \
Create your account on [La Plateforme](https://console.mistral.ai) to \
get access and read the [docs](https://docs.mistral.ai) to learn how to \
use it."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "python314-mistralai-2.7.2-1.1.noarch.rpm"
RPM_HASH = "0aa7980c59a5d6c7fd1eb4927a60fb19f38df9f95ba418610f682f311a8e6f01e432377e07b5bd1d12a5754042e363da408471a4f4da547a79d5af4027c25d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mistralai \
python314-mistralai \
python3dist-mistralai"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-eval-type-backport \
python314-httpx \
python314-invoke \
python314-jsonpath-python \
python314-opentelemetry-api \
python314-opentelemetry-exporter-otlp-proto-http \
python314-opentelemetry-sdk \
python314-opentelemetry-semantic-conventions \
python314-pydantic \
python314-python-dateutil \
python314-typing-inspection"

inherit rpm
