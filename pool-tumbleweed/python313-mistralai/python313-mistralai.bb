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

RPM_NAME = "python313-mistralai-2.7.2-1.1.noarch.rpm"
RPM_HASH = "608bb8c05f297bb588f3608e744b35264386872fe89c5792920d0af467e86950ccf39470079de06276322e97262860e7abd6810530fe1f76421e4279de224733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistralai \
python3.13dist-mistralai \
python313-mistralai \
python3dist-mistralai"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-eval-type-backport \
python313-httpx \
python313-invoke \
python313-jsonpath-python \
python313-opentelemetry-api \
python313-opentelemetry-exporter-otlp-proto-http \
python313-opentelemetry-sdk \
python313-opentelemetry-semantic-conventions \
python313-pydantic \
python313-python-dateutil \
python313-typing-inspection"

inherit rpm
