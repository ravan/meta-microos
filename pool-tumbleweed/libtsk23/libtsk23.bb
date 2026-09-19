SUMMARY = "Library for file system and volume forensic analysis"
DESCRIPTION = "The libtsk23 package contains library for sleuthkit. \
 \
The name of the library was changed from libtsk3 to libtsk"
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "libtsk23-4.14.0-1.8.aarch64.rpm"
RPM_HASH = "2f4a930621028529d72c15eb32ed85fbbbece567f47151bd02aa0c290b77247076362fd521e1b936acd4afb4ffe2c74462059bd1a650e489533410992331f360"

RPROVIDES:${PN} += "libtsk.so.23 \
libtsk23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libewf.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
