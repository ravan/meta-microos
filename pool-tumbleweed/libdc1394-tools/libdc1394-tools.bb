SUMMARY = "Command-line utilities from libdc1394"
DESCRIPTION = "This subpackage contains a 1394 bus reset utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.7"

RPM_NAME = "libdc1394-tools-2.2.7-2.9.aarch64.rpm"
RPM_HASH = "0b0b56ee4e3cf67b8ae9d87f5ea637c1bab1b7daa52fb5eca0800c6d9632290dcadc9dcc2e6bd416024c7e0a0a89aaf066debd337d24d2589610cf6821dbdfdf"

RPROVIDES:${PN} += "libdc1394 \
libdc1394-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdc1394.so.26"

inherit rpm
