SUMMARY = "The proxy backend plugin for sssd"
DESCRIPTION = "A back-end provider which can be used to wrap existing NSS and/or PAM \
modules to leverage SSSD caching. (This can replace nscd.)"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-proxy-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "65cb9d96a4a6783c8d10617bce8be941bda6a4187873764b9d804a080027562904c756dcc5ddd076d1daf9a816e09ae822ca3aa37e0150026c77fcb269aba57c"

RPROVIDES:${PN} += "libsss-proxy.so \
sssd-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
group-sssd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libldb.so.2 \
libpam.so.0 \
libpopt.so.0 \
libsss-certmap.so.0 \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-iface.so \
libsss-sbus.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0"

inherit rpm
