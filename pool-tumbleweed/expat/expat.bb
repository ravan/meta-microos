SUMMARY = "XML Parser Toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags)."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "expat-2.8.4-1.1.aarch64.rpm"
RPM_HASH = "7d61bd1ec2b8d262160ba35a47c6c193939cd8b90b6c6dfc5ff45ffb017ea497a113f2711e105746dde23f8d439eae3702514e576218b566f14a8ae43801cd23"

RPROVIDES:${PN} += "expat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
