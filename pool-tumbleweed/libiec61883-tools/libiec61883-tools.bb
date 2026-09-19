SUMMARY = "Command-line utilities for IEC 61883 devices"
DESCRIPTION = "Utilities to inspect and control IEC 61883 hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libiec61883-tools-1.2.0-9.5.aarch64.rpm"
RPM_HASH = "25229f9c7a668832058ea09a0be7b133a146897681b6ae17eef8a9829d4d7f19f4469befeea2832483a5414bf3c7ab660c1ec2a35b132bd228dd1d5c1f4e8134"

RPROVIDES:${PN} += "libiec61883 \
libiec61883-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiec61883.so.0 \
libraw1394.so.11"

inherit rpm
