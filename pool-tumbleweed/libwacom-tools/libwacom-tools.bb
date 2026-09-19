SUMMARY = "Command-line tools for libwacom"
DESCRIPTION = "libwacom is a library to identify graphics tablets and their model-specific \
features. \
This subpackage provides command-line utilities to query/update the database."
LICENSE = "HPND"

PV = "2.19.1"

RPM_NAME = "libwacom-tools-2.19.1-1.1.aarch64.rpm"
RPM_HASH = "c67c4c855750119bbbafd2f723ead5883559ebdb5e24d8325ac1ef6f5205c5ed83110b1c7f06fba8d504b3a46bd61fcfb048bae0636830b9bea4e9c5627cbc6b"

RPROVIDES:${PN} += "libwacom-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libwacom.so.9 \
python3-libevdev \
python3-pyudev"

inherit rpm
