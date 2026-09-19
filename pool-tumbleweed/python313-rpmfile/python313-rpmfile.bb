SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python313-rpmfile-2.2.1-1.3.noarch.rpm"
RPM_HASH = "6f40a2271fb409210cabca1514011c4d7bd0ba7c7126a01b571d9377a68f8aaaf771de971aafdd491b181cce73bd534d71640671296b8cf4ae01edcaa4c9ed55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmfile \
python3.13dist-rpmfile \
python313-rpmfile \
python3dist-rpmfile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
