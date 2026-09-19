SUMMARY = "Standard library nntplib redistribution. 'dead battery'"
DESCRIPTION = "Standard library nntplib redistribution. 'dead battery'."
LICENSE = "PSF-2.0"

PV = "3.13.0"

RPM_NAME = "python313-standard-nntplib-3.13.0-2.4.noarch.rpm"
RPM_HASH = "86d83a754163a43082633638438d3cfda660bf1a8f14051450c3e13f3c0c22b2a9b8fea56e5bc0c26e9ba4ce9d45829c6fd9b79b3af793af91bf9e4585d1bc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standard-nntplib \
python3.13dist-standard-nntplib \
python313-standard-nntplib \
python3dist-standard-nntplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
