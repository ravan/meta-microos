SUMMARY = "Public suffix list implementaion in Python"
DESCRIPTION = "Parser implementation for the Public Suffix List <https://publicsuffix.org/> in Python. \
 \
Support for IDN (unicode or punycoded)."
LICENSE = "MPL-2.0"

PV = "1.0.2.20260703"

RPM_NAME = "python313-publicsuffixlist-1.0.2.20260703-1.1.noarch.rpm"
RPM_HASH = "ad13c7e07ecfd231b817ff71e73d2360aff644589ce3abbdd00b2df36b1ef7d2ae3419f0a6dd6e124e81546615f6d47c585bedbc07ffa4fd974f6beb3aeb09c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffixlist \
python3.13dist-publicsuffixlist \
python313-publicsuffixlist \
python3dist-publicsuffixlist"

RDEPENDS:${PN} += "publicsuffix \
python-abi"

inherit rpm
