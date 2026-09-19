SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.4"

RPM_NAME = "python313-shellingham-1.5.4-2.5.noarch.rpm"
RPM_HASH = "7ebbedd873ab49692551782b0b7437c765d26124c41bd573790dd1229125c410054255d29496efae449f026cc2b4dbed78d464d5c675379ac98237c9190bae4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shellingham \
python3.13dist-shellingham \
python313-shellingham \
python3dist-shellingham"

RDEPENDS:${PN} += "python-abi"

inherit rpm
