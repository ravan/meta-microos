SUMMARY = "Viewer for dBase III and dBase IV Files"
DESCRIPTION = "dbview is a little tool that displays dBase III and IV files. You can \
also use it to convert your old .dbf files for further use with Unix."
LICENSE = "GPL-2.0+"

PV = "1.0.4"

RPM_NAME = "dbview-1.0.4-118.9.aarch64.rpm"
RPM_HASH = "3ff4b493a021ad10da1ec5b82a08cec79dc9bc021965bd6b3ffb53c77b3566f1513cb836acd854fd2e9ce32ab6cc1ea46ce018fae36d3d7b24cc102541211e56"

RPROVIDES:${PN} += "dbview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
