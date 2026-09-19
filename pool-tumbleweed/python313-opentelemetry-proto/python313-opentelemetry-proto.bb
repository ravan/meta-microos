SUMMARY = "OpenTelemetry Python Proto"
DESCRIPTION = "This library contains the generated code for OpenTelemetry protobuf data model. \
The code in the current package was generated using the v1.9.0 release_ of \
opentelemetry-proto."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python313-opentelemetry-proto-1.43.0-1.1.noarch.rpm"
RPM_HASH = "d07733b51f94ce616ff4f3c4513d5fac57f59ffa87f403a49bb37aa0fbba3e6c4409e013fa6887c20f23319d2922be9c0f4134d41fc423df0d5d4a1e7e561ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-proto \
python3.13dist-opentelemetry-proto \
python313-opentelemetry-proto \
python3dist-opentelemetry-proto"

RDEPENDS:${PN} += "python-abi \
python313-protobuf"

inherit rpm
