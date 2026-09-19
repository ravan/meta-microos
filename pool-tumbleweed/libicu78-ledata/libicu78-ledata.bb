SUMMARY = "Rule databases and tables for ICU"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
 \
ICU makes use of a wide variety of data tables to provide many of its \
services: converter mapping tables, collation rules, transliteration \
rules, break iterator rules and dictionaries. \
 \
This subpackage contains these data tables, in little-endian format."
LICENSE = "Unicode-3.0"

PV = "78.3"

RPM_NAME = "libicu78-ledata-78.3-1.3.noarch.rpm"
RPM_HASH = "2aaf7a096d66227e583917d82714fcde911f0cbd67115accab340554a7804a17298e955ab1ad47505bdaf8ca09770ee21f0acf2d8a61999bd804704ad6e61bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libicu78-ledata"

RDEPENDS:${PN} += ""

inherit rpm
