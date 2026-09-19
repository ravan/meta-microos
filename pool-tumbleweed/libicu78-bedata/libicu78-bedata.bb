SUMMARY = "Rule databases and tables for ICU"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
 \
ICU makes use of a wide variety of data tables to provide many of its \
services: converter mapping tables, collation rules, transliteration \
rules, break iterator rules and dictionaries. \
 \
This subpackage contains these data tables, in big-endian format."
LICENSE = "Unicode-3.0"

PV = "78.3"

RPM_NAME = "libicu78-bedata-78.3-1.3.noarch.rpm"
RPM_HASH = "dcc1fee5974a877511b512e918a2f007e51443e78c49500af96575e46b18560f4a6f9ec90bd3e3f21e6f9c50d0dc8b98ba1dc077c3d603d1a27c98bd833d8984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu78-bedata"

RDEPENDS:${PN} += ""

inherit rpm
