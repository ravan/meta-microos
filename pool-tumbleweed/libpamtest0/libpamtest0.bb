SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "If you plan to test a PAM module, you can use this library, which simplifies \
testing of modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "libpamtest0-1.1.8-1.4.aarch64.rpm"
RPM_HASH = "dee8e8dc41d6b1716c502bb26ab83f1500f2184e589c40ef994fd00f046b90a9788c3af02eb25e67c9629c1af9f192cc3e25f243c79427e254123e52b980863b"

RPROVIDES:${PN} += "libpamtest.so.0 \
libpamtest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam-wrapper"

inherit rpm
