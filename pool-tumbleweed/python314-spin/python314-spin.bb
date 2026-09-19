SUMMARY = "Developer tool for scientific Python libraries"
DESCRIPTION = "Developer tool for scientific Python libraries"
LICENSE = "BSD-3-Clause"

PV = "0.8"

RPM_NAME = "python314-spin-0.8-1.12.noarch.rpm"
RPM_HASH = "887d6c0fa44c0be15cd71fb193496027cc66df5e942b3ac5d766b98501d1e4f0238473eb325c5daeea4bba633e6db4cb5b748624a777eeb6414d29b04be4e045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spin \
python314-spin \
python3dist-spin"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
update-alternatives"

inherit rpm
