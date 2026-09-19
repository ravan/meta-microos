SUMMARY = "Utilities for doing and managing mounts of the Linux CIFS filesystem"
DESCRIPTION = "The cifs-utils package consist of utilities for doing and managing mounts of \
the Linux CIFS filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "cifs-utils-7.7-2.1.aarch64.rpm"
RPM_HASH = "84411e1563e88c5a85af22487276d27490721aaafe6620be5a739cfbd611d5429f31cb5026397e1288a7ffb8c54cb7361a27fed6c7869f8ed8e38aaba80137fd"

RPROVIDES:${PN} += "cifs-mount \
cifs-utils \
config-cifs-utils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
cifs-idmap-plugin \
keyutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgssapi-krb5.so.2 \
libkeyutils.so.1 \
libkrb5.so.3 \
libresolv.so.2 \
libtalloc.so.2"

inherit rpm
