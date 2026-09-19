SUMMARY = "Python module to read rpm files"
DESCRIPTION = "Tools for inspecting RPM files in python. This module is modeled after the tarfile module."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python314-rpmfile-2.2.1-1.3.noarch.rpm"
RPM_HASH = "90c581d10b28e401afa892e0bd780290fe8507b83542b3e2d2c32cd3060f25577777d52002b9dc9dae6052bfd47b03ba21222b8ac5c2c4b7b4cbbcd0eb3c1bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rpmfile \
python314-rpmfile \
python3dist-rpmfile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
