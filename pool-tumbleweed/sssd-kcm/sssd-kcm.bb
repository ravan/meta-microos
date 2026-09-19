SUMMARY = "SSSD's Kerberos cache manager"
DESCRIPTION = "KCM is a process that stores, tracks and manages Kerberos credential \
caches."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-kcm-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "f8a32c4fe745987247919add58b296c9fd8ed5420d5382a86f6d5c7f7a4c3d9983e30f08de44ce6b458ae164b87f9c4627c79d1f2c7d3269299b9693a7675366"

RPROVIDES:${PN} += "sssd-kcm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libkrb5.so.3 \
libldb.so.2 \
libpopt.so.0 \
libselinux.so.1 \
libsss-child.so \
libsss-debug.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtevent.so.0 \
libuuid.so.1 \
sssd"

inherit rpm
