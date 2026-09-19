SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.11.0"

RPM_NAME = "python313-asdf-astropy-0.11.0-1.2.noarch.rpm"
RPM_HASH = "4c3df4a49a46d33bd9d1e1df98288f469724e29ece802bc47f0e4cd447e8aff68d17a03c5c2a129a87af8588f9d49243a0ed699cdb2e278632b227f1034d97cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-astropy \
python3.13dist-asdf-astropy \
python313-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python313-asdf \
python313-asdf-coordinates-schemas \
python313-asdf-standard \
python313-asdf-transform-schemas \
python313-astropy \
python313-numpy \
python313-packaging"

inherit rpm
