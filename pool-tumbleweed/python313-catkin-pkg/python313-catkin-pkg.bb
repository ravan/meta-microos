SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-catkin-pkg-1.1.0-1.4.noarch.rpm"
RPM_HASH = "ac2ee64220fc353f85785601a9d89871e6e400b93fff8634178892e57e4f972850f2fc045591a50f653a50d9e853ff26e48afc9886a8b0ebe1fe28cd0601dcc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-catkin-pkg \
python3.13dist-catkin-pkg \
python313-catkin-pkg \
python3dist-catkin-pkg"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-docutils \
python313-pyparsing \
python313-python-dateutil \
python313-setuptools"

inherit rpm
