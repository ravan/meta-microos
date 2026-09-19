SUMMARY = "Disk and file backed cache"
DESCRIPTION = "DiskCache: Disk Backed Cache \
 \
DiskCache is a disk and file backed cache library, written \
in pure Python, and compatible with Django."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "python313-diskcache-5.6.3-6.3.noarch.rpm"
RPM_HASH = "1c47867df238ab370e34ab0b67658a6a1818d19fc37e4fbafeaece2478c7edc5dfb82a27d8a4f2cfde76d3f56bafa18c19556b854303cd0f743c0d5906580ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diskcache \
python3.13dist-diskcache \
python313-diskcache \
python3dist-diskcache"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
