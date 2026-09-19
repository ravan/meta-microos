SUMMARY = "OpenTelemetry Python SDK"
DESCRIPTION = "OpenTelemetry Python SDK for the OpenTelemetry Project <https://opentelemetry.io/>"
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-sdk-1.43.0-1.1.noarch.rpm"
RPM_HASH = "5dacf7d2f40267c0575773e9692065bd6d9548b464312ec2550b6bf74a0ab58d2ed5f39dbf2928574cd0e204b4611bea1675afeb397477a6deffcfc1fc868247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-sdk \
python314-opentelemetry-sdk \
python3dist-opentelemetry-sdk"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-api \
python314-opentelemetry-semantic-conventions \
python314-typing-extensions"

inherit rpm
