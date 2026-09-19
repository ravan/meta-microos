SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.11.0"

RPM_NAME = "python314-asdf-astropy-0.11.0-1.2.noarch.rpm"
RPM_HASH = "57b3911a95b5ff308fb83cead7fa9dce4eb2f335c23b0c3c2f185c2a2bcba2d2e0e0ebeb8dade0b882710b379ab0020335fe90cc2eaceda043c880b6d126de69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asdf-astropy \
python314-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python314-asdf \
python314-asdf-coordinates-schemas \
python314-asdf-standard \
python314-asdf-transform-schemas \
python314-astropy \
python314-numpy \
python314-packaging"

inherit rpm
