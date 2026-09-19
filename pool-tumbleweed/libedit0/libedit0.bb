SUMMARY = "Command Line Editing and History Library"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt."
LICENSE = "BSD-3-Clause"

PV = "20250104.3.1"

RPM_NAME = "libedit0-20250104.3.1-1.5.aarch64.rpm"
RPM_HASH = "7d41e434661e59ff874f9bb2879df125adba8d9a79cd294f83c181e0653548a874dc18b20befba9b0903670213847d1c12b584a00048744cf0bce21c036e6b4f"

RPROVIDES:${PN} += "libedit \
libedit.so.0 \
libedit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
