SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.6.19"

RPM_NAME = "python314-identify-2.6.19-1.2.noarch.rpm"
RPM_HASH = "cc823f6c4d81b2badd2fcb7a02b1ad1dad2e4a295d97676922f6b15f7795dfa3ba293c377a40128aaf22d836fd4a719b00556cc5d716bbfb2b62ae751e982506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-identify \
python314-identify \
python3dist-identify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
