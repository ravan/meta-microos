SUMMARY = "OCI runtime written in C"
DESCRIPTION = "crun is a runtime for running OCI containers."
LICENSE = "GPL-2.0-or-later"

PV = "1.28"

RPM_NAME = "crun-1.28-2.2.aarch64.rpm"
RPM_HASH = "241c1fcada66e420674297f9f38e35797ebe564a014f544adde059f166770640266711c2f7c66812c0778e2da1d19ba0d72119d0d80a9e45d35cccd168b71793"

RPROVIDES:${PN} += "crun"

RDEPENDS:${PN} += "libc.so.6 \
libcap.so.2 \
libjson-c.so.5 \
libm.so.6 \
libseccomp.so.2 \
libsystemd.so.0"

inherit rpm
