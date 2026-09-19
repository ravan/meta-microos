SUMMARY = "CLI for the Grafana Tempo tracing backend"
DESCRIPTION = "Tempo CLI is a separate executable that contains utility functions related to \
the Tempo software. Although it is not required for a working installation, \
Tempo CLI can be helpful for deeper analysis or for troubleshooting."
LICENSE = "Apache-2.0"

PV = "3.0.3"

RPM_NAME = "tempo-cli-3.0.3-1.1.aarch64.rpm"
RPM_HASH = "104525eca35755d700b3018c2b367c12a0da8ceda835d55ddcaea95b3db221a3f4a135155826ceb6e189903ee6b2f806ba636ddec31f2ec9f37d1d0ff0ff6eae"

RPROVIDES:${PN} += "tempo-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
