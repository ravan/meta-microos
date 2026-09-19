SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python313-vcversioner-2.16.0.0-6.5.noarch.rpm"
RPM_HASH = "a112e594ba1a590e5957263e9ebbc6ac46d19f968bd7d2f22ff6501c11f78dea47f30ce88ddc34f6e5e343824a8d26f30f8e142194acdda3e0e3eb64847d8e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcversioner \
python3.13dist-vcversioner \
python313-vcversioner \
python3dist-vcversioner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
