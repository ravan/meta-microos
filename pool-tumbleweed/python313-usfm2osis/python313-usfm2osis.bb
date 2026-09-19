SUMMARY = "Tools for converting Bibles from USFM to OSIS XML"
DESCRIPTION = "Tools for converting Bibles from USFM to OSIS XML"
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1+git.1613099315.8fda304"

RPM_NAME = "python313-usfm2osis-0.6.1+git.1613099315.8fda304-2.12.noarch.rpm"
RPM_HASH = "6565f7b91fe1163e0fcc26250317727d66b956c2fb8e87f2383114eef9aee318e01a164b661e34939560b7f023f9f219a9afe0b0dbfb581d6ffae281403f37ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-usfm2osis \
python3.13dist-usfm2osis \
python313-usfm2osis \
python3dist-usfm2osis"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
