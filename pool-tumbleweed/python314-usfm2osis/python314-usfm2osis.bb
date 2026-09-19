SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python314-usfm2osis-0.6.1+git.1613099315.8fda304-2.12.noarch.rpm"
RPM_HASH = "1e3a1b0131f057f6d947e641c779057f326d4a046f5248cc150a3898ee2d0cfac17b72549d2e2e3445960682d9319ad95a012895fa52dbafa89712ed57e6da80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-usfm2osis \
python314-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
