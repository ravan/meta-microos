SUMMARY = "An economy and city building game"
DESCRIPTION = "Unknown Horizons is a 2D realtime strategy simulation with an emphasis on \
economy and city building. The player has to expand a small settlement to a strong and \
wealthy colony, collect taxes and supply inhabitants with valuable \
goods, and increase the power with a well balanced economy and with strategic \
trade and diplomacy."
LICENSE = "APL-1.0 & CC-BY-SA-3.0 & GPL-2.0-with-font-exception & MIT & OFL-1.1"

PV = "2019.1"

RPM_NAME = "unknown-horizons-2019.1-10.4.noarch.rpm"
RPM_HASH = "e0c97f67d5ead34985bff0e8dbd56087bef4c237237fcd9e5fb56f0aff21863857257489971135ed8b6abde65a7d9bf130570c970328a8be04de73707648a822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-unknownhorizons \
python3dist-unknownhorizons \
unknown-horizons"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
hicolor-icon-theme \
python-abi \
python3-Pillow \
python3-PyYAML \
python3-fife"

inherit rpm
