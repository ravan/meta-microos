SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-evilunit-0.2.1-2.5.noarch.rpm"
RPM_HASH = "b1a31a0c53170f143c01e3d72501bfd1422a34407732750cbcc45458633f6e96cf0020ce1a936ba67f73ee20bbd9f03ffdaa1776122768fd1a52771c614229e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-evilunit \
python314-evilunit \
python3dist-evilunit"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
