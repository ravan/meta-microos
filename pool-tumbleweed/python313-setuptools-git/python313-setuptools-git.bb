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

RPM_NAME = "python313-setuptools-git-1.2-5.5.noarch.rpm"
RPM_HASH = "7f687ebe91d9aa9d7bd9150c61784a03d38cc3a490f75adaaaadf0e58d7a5dd34ef39a8e9e0cff9e7c4b4d4a309edbad881b381df842ffc4450e488801b7afbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-git \
python3.13dist-setuptools-git \
python313-setuptools-git \
python3dist-setuptools-git"

RDEPENDS:${PN} += "python-abi"

inherit rpm
