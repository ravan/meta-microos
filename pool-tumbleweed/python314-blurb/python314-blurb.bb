SUMMARY = "Command-line tool to manage CPython Misc/NEWS.d entries"
DESCRIPTION = "Command-line tool to manage CPython Misc/NEWS.d entries."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python314-blurb-2.0.0-2.7.noarch.rpm"
RPM_HASH = "de1a7d75bbbd095efd526c68c83d83f7173adcbbed2ea07aa204cb0254e5102d57fcfd12ef995d8c46bb060eeefffad56dc7383188a412ab56128aab9278f8a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blurb \
python314-blurb \
python3dist-blurb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
