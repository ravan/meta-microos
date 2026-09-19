SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.51"

RPM_NAME = "python313-check-manifest-0.51-3.2.noarch.rpm"
RPM_HASH = "0af74a018cacc217d7cbda259cae53a082fdec282d8ec38015ef155df49a9bea8c5a8f5c376afee0d269a0cecc99dff0224b31b848515e55472d5c50a61d727e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-check-manifest \
python3.13dist-check-manifest \
python313-check-manifest \
python3dist-check-manifest"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-build \
python313-setuptools"

inherit rpm
