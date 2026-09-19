SUMMARY = "Python Module for Parallel SSH"
DESCRIPTION = "pssh provides parallel versions of the OpenSSH tools that are useful for \
controlling large numbers of machines simultaneously. It includes parallel \
versions of ssh, scp, and rsync, as well as a parallel kill command. \
 \
This package contains the pssh Python module."
LICENSE = "BSD-3-Clause"

PV = "2.3.4+git10.d4909c9"

RPM_NAME = "python-pssh-2.3.4+git10.d4909c9-5.3.noarch.rpm"
RPM_HASH = "aceba7f953be3378fbb046307a04eeb487aa3512fe634058fe18140bd043f701040d9930aa4af910cea01a843a5bae2209b862d048f5f089ef6cc40539dcbb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pssh \
python3.13dist-pssh \
python3dist-pssh"

RDEPENDS:${PN} += "openssh \
python-abi \
rsync"

inherit rpm
