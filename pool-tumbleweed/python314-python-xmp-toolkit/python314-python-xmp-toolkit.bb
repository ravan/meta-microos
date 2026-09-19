SUMMARY = "Python XMP Toolkit for working with metadata"
DESCRIPTION = "A Python XMP Toolkit for working with metadata."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python314-python-xmp-toolkit-2.0.2-1.2.noarch.rpm"
RPM_HASH = "2c88192640b2c932a2e13e89913ac14b542f48786034864caef7025ef49b7491f3ca05753ae037521a5de1b676f68e53a180205cb263f4c8ea4f81f4632eab1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-xmp-toolkit \
python314-python-xmp-toolkit \
python3dist-python-xmp-toolkit"

RDEPENDS:${PN} += "python-abi \
python314-pytz"

inherit rpm
