SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-api-1.43.0-1.1.noarch.rpm"
RPM_HASH = "dc817cf8e4a9a110fc8494aedb889873229bea5635383d7283717cce33b8baff4a87ee3b1ff84bcad5649ee46e62c60c9a1878f0e658cf29f12d7cb124ee87dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-api \
python314-opentelemetry-api \
python3dist-opentelemetry-api"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
