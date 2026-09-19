SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "python314-diskcache-5.6.3-6.3.noarch.rpm"
RPM_HASH = "75164a93d7ac831f4e7b27ff45736e0148d7915a11b990705d51ebd3d9b5f4cdad9aee261deb97dd50dfe2a7711bd76063dc90fbf57db5a3f8b71675ea208c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-diskcache \
python314-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python314"

inherit rpm
