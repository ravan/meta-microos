SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python314-zope.exceptions-6.0-1.4.noarch.rpm"
RPM_HASH = "ffc5cc8574389667a29c0e7ed249606fc3ac457b1db2041fe1a6a40e3d1c9d656d6f54b68ae12aa4dad2bb1f25e117e6eeebb4e20e3d4410330eefa440967d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.exceptions \
python314-zope.exceptions \
python3dist-zope.exceptions"

RDEPENDS:${PN} += "python-abi \
python314-setuptools \
python314-zope.interface"

inherit rpm
