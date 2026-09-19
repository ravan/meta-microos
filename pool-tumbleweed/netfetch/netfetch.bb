SUMMARY = "Scanning clusters for network policies and identifying unprotected workloads"
DESCRIPTION = "This project aims to demystify network policies in Kubernetes. It's a work in \
progress! \
 \
The netfetch tool will scan your Kubernetes cluster and let you know if you \
have any pods running without being targeted by network policies."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "netfetch-0.5.4-1.10.aarch64.rpm"
RPM_HASH = "b2cb54bc35f9baa06ce2311826c0e70d9621f9dd4903ba460a6fc37113a374f450e4ac90bd9fda5466bc06fec0f4d6d09e38817213c78aa33f0e57fa2d057c9e"

RPROVIDES:${PN} += "netfetch"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
