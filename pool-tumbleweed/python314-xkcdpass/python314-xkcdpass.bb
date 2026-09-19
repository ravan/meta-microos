SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.30.0"

RPM_NAME = "python314-xkcdpass-1.30.0-1.2.noarch.rpm"
RPM_HASH = "e9e38f889cc866eb368ac94adf9445d6d089fba94d1a990cef39a3d5723dc1411e0a5948e8cb110e2c51435eef451c07acfc7d513808f048d953ad2d925d3f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xkcdpass \
python314-xkcdpass \
python3dist-xkcdpass"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
