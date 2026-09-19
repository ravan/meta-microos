SUMMARY = "OpenWSMAN server and service libraries"
DESCRIPTION = "OpenWSMAN server and service libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "openwsman-server-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "4b4d19331ae3cafee55529457eb63b94e9fc8fdc30d139f97e1b3fd18e927cd3ff680e26677e9ad200067aef54050f3a4f5213d8f2d06afb127c5e12b08541de"

RPROVIDES:${PN} += "config-openwsman-server \
libredirect.so.1 \
libwsman-cim-plugin.so.1 \
libwsman-file-auth.so.1 \
libwsman-identify-plugin.so.1 \
libwsman-pam-auth.so.1 \
libwsman-server.so.1 \
libwsman-test.so.1 \
openwsman-server"

RDEPENDS:${PN} += "/usr/bin/hostname \
/usr/bin/sh \
coreutils \
diffutils \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmpisfcc.so.1 \
libcrypt.so.1 \
libcrypto.so.3 \
libpam.so.0 \
libssl.so.3 \
libwsman.so.1 \
sed"

inherit rpm
