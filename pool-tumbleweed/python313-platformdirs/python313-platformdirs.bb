SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "4.11.7"

RPM_NAME = "python313-platformdirs-4.11.7-1.1.noarch.rpm"
RPM_HASH = "54b18e7000057d39ef786f0040d9af91403c1a88e320681b774c2c34f2dc3165ba6d57b4106989bf27a4e0f23e97ac29fe8600ccc1728f4d383e45b1b1ab58da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformdirs \
python3.13dist-platformdirs \
python313-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
