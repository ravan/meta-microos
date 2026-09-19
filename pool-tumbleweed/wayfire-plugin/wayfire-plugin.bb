SUMMARY = "Plugin management utility for wayfire"
DESCRIPTION = "Plugin management utility for wayfire."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wayfire-plugin-0.11.0-1.1.noarch.rpm"
RPM_HASH = "0045023550625f4e642722eaf6c30dc15f4b563d21a040db1895ae979d85ea830582b8275bc1644a948d5a7e2f19992e1890179a91635c74ba2890c904412261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wayfire-plugin"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
wayfire"

inherit rpm
