SUMMARY = "Manual page display program for the X Window System"
DESCRIPTION = "xman is a graphical manual page browser."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "xman-1.2.0-1.9.aarch64.rpm"
RPM_HASH = "2eb6f8f127e8d2da3f7e6d18898c90585101f56477fd74075d875f65aaa9f2528558ba8b1ba32727b6adf65ec9817f03f1ed4a7b776a43cc00082512189b22b8"

RPROVIDES:${PN} += "xman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
