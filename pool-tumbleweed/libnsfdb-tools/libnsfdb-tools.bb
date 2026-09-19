SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnsfdb to \
read Notes Storage Facility databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libnsfdb-tools-20260526-1.12.aarch64.rpm"
RPM_HASH = "b682b476705b4836a2b637ac9cda3c73fa4ee5e487440b0aa667492a90cc8669b13ef021372913da5df4aa508f04a1c55216241ad985d18d99c5d51657cd36b2"

RPROVIDES:${PN} += "libnsfdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libnsfdb.so.1"

inherit rpm
