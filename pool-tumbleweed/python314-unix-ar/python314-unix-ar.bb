SUMMARY = "AR file handling"
DESCRIPTION = "AR file handling"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python314-unix-ar-0.2.1-1.5.noarch.rpm"
RPM_HASH = "7e1a9ee7d4be41e429ea812b962d8e9d75ec059b553416e4825a7407161c4c424ddbb02f7cf8a82089a7875232d9c60f8c2f84046204ff2888c466f5b2237302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unix-ar \
python314-unix-ar \
python3dist-unix-ar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
