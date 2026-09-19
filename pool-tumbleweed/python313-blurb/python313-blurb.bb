SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python313-blurb-2.0.0-2.7.noarch.rpm"
RPM_HASH = "12f76f8ff78cbbc93e4c66b0439925a1717aa5bea35c7b5be81986188769767d3c774a5f16b160f1514c1d1e98a5a34c6b053bb455ad63ee6a4be8af7339fdae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blurb \
python3.13dist-blurb \
python313-blurb \
python3dist-blurb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
