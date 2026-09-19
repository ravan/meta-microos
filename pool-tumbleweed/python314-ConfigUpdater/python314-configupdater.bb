SUMMARY = "Parser like ConfigParser but for updating configuration files"
DESCRIPTION = "The sole purpose of this program is to easily update an INI config file \
with no changes to the original file except the intended ones. This means \
comments, the ordering of sections and key/value-pairs as wells as their \
cases are kept as in the original file. Thus ConfigUpdater provides \
complementary functionality to Python's ConfigParser which is primarily \
meant for reading config files and writing new ones."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "python314-ConfigUpdater-3.2-2.5.noarch.rpm"
RPM_HASH = "fd95be6b6f8bd3699eb1d7a357d67b28fb12844dbb5b6b1875fdf45963872c13740f8f502c86009c1354923869874aa124ba0738944754a618f878cf8b499fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-configupdater \
python314-ConfigUpdater \
python314-configupdater \
python3dist-configupdater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
