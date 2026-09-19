SUMMARY = "A binary reaping children"
DESCRIPTION = "This executable can be used as a minimal init process inside a container."
LICENSE = "Apache-2.0"

PV = "0.9"

RPM_NAME = "kubic-pause-0.9-1.30.aarch64.rpm"
RPM_HASH = "c671afcaa64d3388e85d7850bce22ac875db8066725a6ac1d4f50796cc50aaa8699d60a37b6d0cf1f7667847057f016890b0305ba6e59c4a96748c74ca95fa67"

RPROVIDES:${PN} += "kubic-pause"

RDEPENDS:${PN} += ""

inherit rpm
