SUMMARY = "setup.py extension for deriving versions from SCM tags"
DESCRIPTION = "A setup.py file can be written with no version information \
specified, and vcversioner will find a recent, properly-formatted \
VCS tag and extract a version from it."
LICENSE = "ISC"

PV = "2.16.0.0"

RPM_NAME = "python314-vcversioner-2.16.0.0-6.5.noarch.rpm"
RPM_HASH = "28f269a1062c521f39ff3949bbb70757eb25481f0804c61a0a85aa187c792da077e9ee34a1809aaa1ad44a39eb806c635270070a08ede0b3c1e2144127ea1b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vcversioner \
python314-vcversioner \
python3dist-vcversioner"

RDEPENDS:${PN} += "python-abi"

inherit rpm
