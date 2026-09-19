SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python313-gwcs-1.0.3-1.2.noarch.rpm"
RPM_HASH = "2d41e2aec4e6a30baa53007af2787b0dff38652f1e0f002969856ccfd97e48bf981b92a01ee50153252216cbefb03efdb68ea4d426882dcf5902dcb1ef14333b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwcs \
python3.13dist-gwcs \
python313-gwcs \
python3dist-gwcs"

RDEPENDS:${PN} += "python-abi \
python313-asdf \
python313-asdf-astropy \
python313-asdf-wcs-schemas \
python313-astropy \
python313-numpy \
python313-scipy"

inherit rpm
