SUMMARY = "Core SANE library"
DESCRIPTION = "This contains the SANE library. Individual scanner backends are provided \
by sane-backends or third party packages."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.3.1"

RPM_NAME = "libsane1-1.3.1-3.11.aarch64.rpm"
RPM_HASH = "57f7fc5f72e93cb6ff2e3ae97780cdca1b76f69c98ee46257b2038503d6c5c6d4ef51174c8721352d380803b369caa673a49069e68b1befc834dd23e23618d7b"

RPROVIDES:${PN} += "libsane.so.1 \
libsane1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
libxml2.so.16"

inherit rpm
