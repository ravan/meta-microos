SUMMARY = "A library for extracting HTML content from RTF encapsulated HTML"
DESCRIPTION = "A library for extracting HTML content from RTF encapsulated HTML as commonly found in the exchange MSG email format."
LICENSE = "LGPL-3.0-or-later"

PV = "0.1.2.2"

RPM_NAME = "python313-RTFDE-0.1.2.2-1.2.noarch.rpm"
RPM_HASH = "3b6407076e1d1c23bea6402a9ccf010d9abb87162f2090a83ab044850d688a288d3b1ba7b4d5f40ef072a5b3789c9b855ceac1d4656a5c6c06788c0b8d3543e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-RTFDE \
python3.13dist-rtfde \
python313-RTFDE \
python3dist-rtfde"

RDEPENDS:${PN} += "python-abi \
python313-lark \
python313-oletools"

inherit rpm
