SUMMARY = "Utility for storing metadata in a LUKSv1 header"
DESCRIPTION = "The luksmeta utility enables an administrator to store metadata in the gap \
between the end of the LUKSv1 header and the start of the encrypted data."
LICENSE = "LGPL-2.1-or-later"

PV = "9"

RPM_NAME = "luksmeta-9-1.11.aarch64.rpm"
RPM_HASH = "4467963c47265ff462a5cd18100ac6b9aaa9efcfc3de2dcbd86c1aefc9ae80322672846025f3bc1bef0f3bf717fb54d82fc02bbe2120fd71915ab31316e54322"

RPROVIDES:${PN} += "luksmeta"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libluksmeta.so.0"

inherit rpm
