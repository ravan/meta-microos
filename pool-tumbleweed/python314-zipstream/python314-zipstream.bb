SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python314-zipstream-1.1.4-5.5.noarch.rpm"
RPM_HASH = "68519af1cdbf1435fb0dd1b78b6b1b3892bee84ee97f34be197f371003cb945e395c7849f685d6411f5dd970c38876ceabcd1cbcdd05b9ec649df4d552a3571a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zipstream \
python314-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
