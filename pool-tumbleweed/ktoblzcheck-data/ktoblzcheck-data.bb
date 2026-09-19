SUMMARY = "A library to check account numbers and bank codes of German banks"
DESCRIPTION = "KtoBLZCheck is a library to check account numbers and bank codes \
of German banks. Both a library for other programs as well as a \
short command-line tool is available. It is possible to check \
pairs of account numbers and bank codes (BLZ) of German banks, \
and to map bank codes (BLZ) to the clear-text name and location \
of the bank."
LICENSE = "LGPL-2.1-only"

PV = "20250515"

RPM_NAME = "ktoblzcheck-data-20250515-2.4.noarch.rpm"
RPM_HASH = "abd56db95f211fa3c62ca252a42f2183b2c32a22eab7e2402662409ccbe7973cbc3dc68a92341d1c5395c41c32d3b190981aae5f9f57df0e8f0afdcc37ce1224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktoblzcheck-data"

RDEPENDS:${PN} += ""

inherit rpm
