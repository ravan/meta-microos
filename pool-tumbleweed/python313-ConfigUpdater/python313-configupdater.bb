SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "python313-ConfigUpdater-3.2-2.5.noarch.rpm"
RPM_HASH = "ae05ad1a13f5c16e228c7702100e2bc67d6d46c15d850aa99a1824ed557324d973c223afe3abc24a6a1a7dc33c8423f5ef653d179e2573b26c4f4549f80d7799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ConfigUpdater \
python3-configupdater \
python3.13dist-configupdater \
python313-ConfigUpdater \
python313-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
