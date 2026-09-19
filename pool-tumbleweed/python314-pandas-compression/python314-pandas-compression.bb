SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python314-pandas-compression-3.0.5-2.2.noarch.rpm"
RPM_HASH = "9c845c7921d26fb825e4e4e08c1f3417fbe491d54aaf6c4694f06feb9960ec89c406ff85437115513ff58c592d7e1a3ba3d2caa319d893e08c187a69e6b41ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pandas-compression"

RDEPENDS:${PN} += "python314-pandas \
python314-zstandard"

inherit rpm
