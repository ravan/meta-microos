SUMMARY = "An OCI container runtime monitor"
DESCRIPTION = "Conmon is a monitoring program and communication tool between a \
container manager (like podman or CRI-O) and an OCI runtime (like \
runc or crun) for a single container."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "conmon-2.2.1-1.5.aarch64.rpm"
RPM_HASH = "24c61a49a7f9c086a24bac533072b91168a87b7222def54312a780fbd9fbdf3ce6f20ad0ff01a68402f993bb0cbcaa745c1502b580b6a4349070ee1839ecafdf"

RPROVIDES:${PN} += "conmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsystemd.so.0"

inherit rpm
