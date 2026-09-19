SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-computation-3.0.5-2.2.noarch.rpm"
RPM_HASH = "41beacf0830e08e8296a1118bc35cca329d572f3e2381d0ddb78c352d2114691be4bc358f0303d0a13c85bbaa97c56df06e40b00d025225fb422613262db9a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-computation"

RDEPENDS:${PN} += "python314-pandas \
python314-scipy \
python314-xarray"

inherit rpm
