SUMMARY = "A tool for integrating Git with Patchwork"
DESCRIPTION = "git-pw is a tool for integrating Git with Patchwork, the web-based patch \
tracking system."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "python313-git-pw-2.8.1-1.2.noarch.rpm"
RPM_HASH = "ebb2bb06caaad634ff74b6eea1ef246b1c91cd30458bf88cf7907a62aea485c2af24a83e05548e298c988fce08e80042c0fe06520cd84d32377f0dded99b7010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-pw \
python3-git-pw \
python3.13dist-git-pw \
python313-git-pw \
python3dist-git-pw"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
git-core \
python-abi \
python313-PyYAML \
python313-arrow \
python313-click \
python313-requests \
python313-tabulate \
update-alternatives"

inherit rpm
