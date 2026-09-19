SUMMARY = "A binary reaping children"
DESCRIPTION = "This executable can be used as a minimal init process inside a container."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "kubernetes-pause-3.2-1.25.aarch64.rpm"
RPM_HASH = "46998b6b25a54316c05337c16338bda46a4358371f91ac461bf618d1ed7415be9e2b304a9e3f76979b84b6de10bd38f9dd9e4142f131b8b155c65ad44c18b055"

RPROVIDES:${PN} += "kubernetes-pause \
kubic-pause"

RDEPENDS:${PN} += ""

inherit rpm
