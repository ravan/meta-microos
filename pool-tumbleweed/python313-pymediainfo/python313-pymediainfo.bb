SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python313-pymediainfo-7.0.1-1.8.noarch.rpm"
RPM_HASH = "16d9de034af3adfa8681756a7894a3aed457c3cc8e76d127d1f5b9875597c9169188b87d9db370df000da99a03480155e1669056020747b2d9ecf6cd2ba728cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymediainfo \
python3.13dist-pymediainfo \
python313-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
