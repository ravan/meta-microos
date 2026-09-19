SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python314-photutils-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "580b274a94aaac0dc6cb992ba62c7e3751e178e1bc4a30d0adbf045bdf5dfca7b13f18d0750a10f45f9524c97e1110dc85f836d7b11b9b71f00ec610c902dfe7"

RPROVIDES:${PN} += "python3.14dist-photutils \
python314-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-astropy \
python314-numpy \
python314-scipy"

inherit rpm
