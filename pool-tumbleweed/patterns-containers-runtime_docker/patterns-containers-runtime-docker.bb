SUMMARY = "Docker Container Runtime"
DESCRIPTION = "This pattern installs Docker as the container runtime."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-containers-runtime_docker-5.1-10.2.aarch64.rpm"
RPM_HASH = "da0d0bf1fabc30b0a2b0c90b8028889906555f5bfc0228dbdd1212fb411fc538e6c20769d1840fb71d4fb7e6be74d2af5b4ee31699c907187194ad1f43e37933"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-container-runtime-docker \
patterns-containers-runtime-docker"

RDEPENDS:${PN} += "docker \
pattern-"

inherit rpm
