SUMMARY = "OpenTelemetry Semantic Conventions"
DESCRIPTION = "This library contains generated code for the semantic conventions \
defined by the OpenTelemetry specification."
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python313-opentelemetry-semantic-conventions-0.64b0-1.1.noarch.rpm"
RPM_HASH = "6f824232ead590cb390374cf42f22c1e46f1b1e788623de4e876c7b7a6f314f5049a54339722d6cf96eb2085c4a7231beab8a023c3c8a105902af3e5d51385c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-semantic-conventions \
python3.13dist-opentelemetry-semantic-conventions \
python313-opentelemetry-semantic-conventions \
python3dist-opentelemetry-semantic-conventions"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-api \
python313-typing-extensions"

inherit rpm
