SUMMARY = "Library for applications to utilize the Messenger service of GNUnet"
DESCRIPTION = "This library is an abstraction layer using the client API from different GNUnet \
services to provide the functionality of a typical messenger application. The \
goal is to make developing such applications easier and independent of the GUI \
toolkit. So people can develop different interfaces being compatible with \
eachother despite visual differences, a few missing features or differences in \
overall design."
LICENSE = "AGPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "libgnunetchat-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "6f6948233d100aa264bb78ceb968c39050ad5717fdc105a6db9c17809e5927db8ec6cd30a7f6c3133fc0b2d1531fab42f7539da2738484633cca2180c4d8a74c"

RPROVIDES:${PN} += "libgnunetchat \
libgnunetchat.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetarm.so.2 \
libgnunetfs.so.2 \
libgnunetgns.so.0 \
libgnunetgnsrecord.so.0 \
libgnunetidentity.so.1 \
libgnunetmessenger.so.0 \
libgnunetnamestore.so.0 \
libgnunetreclaim.so.0 \
libgnunetregex.so.3 \
libgnunetutil.so.20"

inherit rpm
