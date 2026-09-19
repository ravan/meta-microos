SUMMARY = "Commandline tools for sssd"
DESCRIPTION = "The packages contains command-line tools for managing users and groups using \
the 'local' id provider of the System Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "sssd-tools-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "304a71bbb095e2b2724828d778b64d1afae8356b9952bc57b7584287a3a6d0ce6b18056252102fa2f7e78ef3a6d5008e1eb7c7afb12963c3e609984ddab1e7dc"

RPROVIDES:${PN} += "sssd-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libifp-iface-sync.so \
libini-config.so.8 \
libldb.so.2 \
libpam-misc.so.0 \
libpam.so.0 \
libpopt.so.0 \
libsss-certmap.so.0 \
libsss-crypt.so \
libsss-debug.so \
libsss-iface-sync.so \
libsss-sbus-sync.so \
libsss-sbus.so \
libsss-util.so \
libtalloc.so.2 \
python-abi \
python3-sssd-config \
sssd"

inherit rpm
