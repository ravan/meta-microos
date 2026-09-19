SUMMARY = "Malcontent system library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "libmalcontent-0-0-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "2545feb0d5dcd4fdd2fa0b6c2e77d53e87d76aaab4e55a06d201cefa194639522f7df8cf542f9eb24c576020a673aee6600c1c7678c26a48130a958e3b3fed93"

RPROVIDES:${PN} += "libmalcontent-0-0 \
libmalcontent-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
malcontent"

inherit rpm
