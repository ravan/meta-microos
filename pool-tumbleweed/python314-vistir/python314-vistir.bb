SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python314-vistir-0.8.0-4.1.noarch.rpm"
RPM_HASH = "86b1aa75c2fc2f924a277b2bb4620e45f860b15c95f14d9ad62bf53aa4a1000a5cddca8df8df796e4850d17a8747f50413e748e9109ddafae2289eda06af2a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vistir \
python314-vistir \
python3dist-vistir"

RDEPENDS:${PN} += "python-abi \
python314-colorama"

inherit rpm
