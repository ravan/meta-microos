SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-sat-search-0.3.0-3.8.noarch.rpm"
RPM_HASH = "c8b74e6b960be99ada81831b1622a74d1c339b9bbb191d74b1b92fdf127c22e71c9a4786fd70e75edf6e071eddbb271f19e389578e59a0c3871dc2a58bcdab90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sat-search \
python314-sat-search \
python3dist-sat-search"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-sat-stac \
update-alternatives"

inherit rpm
