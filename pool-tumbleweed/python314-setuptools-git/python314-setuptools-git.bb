SUMMARY = "Setuptools revision control system plugin for Git"
DESCRIPTION = "This is a plugin for setuptools that enables git integration. Once \
installed, Setuptools can be told to include in a package distribution \
all the files tracked by git. This is an alternative to explicit \
inclusion specifications with MANIFEST.in. \
 \
This package was formerly known as gitlsfiles. The name change is the \
result of an effort by the setuptools plugin developers to provide a \
uniform naming convention."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python314-setuptools-git-1.2-5.5.noarch.rpm"
RPM_HASH = "f8e7b6fd98dd027dd1ebd9c3b2d6dfaa0700b4f64b4d9219cbb4a79e0be0732785193bb807f788fa68754373c14c2fb2815208f951091282ad1835fcd4a30bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-git \
python314-setuptools-git \
python3dist-setuptools-git"

RDEPENDS:${PN} += "python-abi"

inherit rpm
