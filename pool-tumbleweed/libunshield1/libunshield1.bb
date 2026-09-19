SUMMARY = "A Program to Extract InstallShield Cabinet Files"
DESCRIPTION = "Cabinet (.CAB) files are a form of archive, which is used by the \
InstallShield installer software. The unshield program simply unpacks \
such files. This is the shared library."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libunshield1-1.6.2-1.4.aarch64.rpm"
RPM_HASH = "7a620f7a29beb79fcb51e3cc8cfc837b3a423aa982a73ffead4ea4175ad49d50dcda32b5b359d43923319e45661df161a5e5e2312893e36604dd86395916bbcd"

RPROVIDES:${PN} += "libunshield.so.1 \
libunshield1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libz.so.1"

inherit rpm
