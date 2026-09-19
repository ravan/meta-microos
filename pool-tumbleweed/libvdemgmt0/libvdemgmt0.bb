SUMMARY = "VDE management library"
DESCRIPTION = "This package contains a library to interact with vde_switch \
management console using pre-made unattended scripts."
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdemgmt0-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "e38ef5aa92b741d499440e6693618a81532d91a5554fc15bed295b1f1a45f0330b9bc85d43b96680109818dc86a89ab8c295a0097128098c2905ce1b87ff3607"

RPROVIDES:${PN} += "config-libvdemgmt0 \
libvdemgmt.so.0 \
libvdemgmt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
