SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python314-dotmap-1.3.30-2.5.noarch.rpm"
RPM_HASH = "87d718cb8594c287521a2164c7765077694c8b164c2b6c46e94459313a931b8056ba2da4e584d4fa29521a2e3794216c9b3bd55aa55a4bdab76ed2c7200fc810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dotmap \
python314-dotmap \
python3dist-dotmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
