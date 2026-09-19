SUMMARY = "Mock HTTPX with request patterns and response side effects"
DESCRIPTION = "Python library to mock httpx with request patterns and responses"
LICENSE = "BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "python314-respx-0.23.1-1.2.noarch.rpm"
RPM_HASH = "1d74a2597e62fd8ba62491eeae514700b4aadf135d822ffcfb721e96eb1dd9a240aa6de3620801bd93292f6bc7e19445cfc0ffb1219adc2534a08b9e6f29b3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-respx \
python314-respx \
python3dist-respx"

RDEPENDS:${PN} += "python-abi \
python314-httpx"

inherit rpm
