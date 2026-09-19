SUMMARY = "Utility to test IP multicast functionality"
DESCRIPTION = "Omping (Open Multicast Ping) is tool to test IP multicast functionality \
primarily in local network."
LICENSE = "ISC"

PV = "0.0.5"

RPM_NAME = "omping-0.0.5-2.18.aarch64.rpm"
RPM_HASH = "fe26c2e3bf650fecb06831e30914de0dd66f746396f3fefc68c74fc0d928d0d453a8af6016304e5aa1f895aaf7bafbe0032639ac7bb6db60942837da0efa9031"

RPROVIDES:${PN} += "omping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
