SUMMARY = "Development files for the dbm key/data database library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.26"

RPM_NAME = "gdbm-devel-1.26-1.6.aarch64.rpm"
RPM_HASH = "cadfb26e3eb513401e78ea932446008d5fa120394049d22d66bc9a44f5b4bebb3a30cc27439e268545f80473d279f205a9aa5ebcb53eeea5857d6ad372f9457b"

RPROVIDES:${PN} += "gdbm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat4 \
libgdbm.so.6 \
libgdbm6 \
libreadline.so.8"

inherit rpm
