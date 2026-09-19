SUMMARY = "Catkin package library"
DESCRIPTION = "Library for retrieving information about catkin packages."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-catkin-pkg-1.1.0-1.4.noarch.rpm"
RPM_HASH = "44e7c280d411ff40752ff111e64d196548c2a50b06e3c38ca1806d3d99f844d0b8d5fe5bb11427c848163e1b98274643fd94bd52266a09bf2a9aa541bf7939c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-catkin-pkg \
python314-catkin-pkg \
python3dist-catkin-pkg"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-docutils \
python314-pyparsing \
python314-python-dateutil \
python314-setuptools"

inherit rpm
