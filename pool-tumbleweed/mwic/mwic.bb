SUMMARY = "A spellchecker with grouping support"
DESCRIPTION = "mwic is a spell-checker that groups possible misspellings and shows \
them in their contexts. This is useful for checking technical \
documents that often contain words that are not included in standard \
dictionaries."
LICENSE = "MIT"

PV = "0.7.10"

RPM_NAME = "mwic-0.7.10-1.9.noarch.rpm"
RPM_HASH = "3cdb3fa1ef613fc2d91192efae21685c7e768ace666b5b811a13b4c18e4f7f0e4a21aa7b0f046e13b445ff92ded7bb780ddd224f68cc651e1c361aee9291c9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mwic"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-pyenchant \
python3-regex"

inherit rpm
