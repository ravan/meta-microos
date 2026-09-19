SUMMARY = "Python XMP Toolkit for working with metadata"
DESCRIPTION = "A Python XMP Toolkit for working with metadata."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python313-python-xmp-toolkit-2.0.2-1.2.noarch.rpm"
RPM_HASH = "b674b1d65eb7eb0e9b7d675ab1f626a60a7cbd4fed2003da1b79f639ac99833c2e709d719b36776e2012820c4abeb56c120f188a26939c70b32e20780566a602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-xmp-toolkit \
python3.13dist-python-xmp-toolkit \
python313-python-xmp-toolkit \
python3dist-python-xmp-toolkit"

RDEPENDS:${PN} += "python-abi \
python313-pytz"

inherit rpm
