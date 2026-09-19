SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python313-Wand-0.7.2-1.2.noarch.rpm"
RPM_HASH = "15270f8d0e4278e7e7b75ac1d7eb430a55bf5e40f2ac771dce177c84045607c0d19eaf443a69ab46620029b0ca8c2ba2e91cbd5ec1693fabb204bf9004309e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Wand \
python3.13dist-wand \
python313-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
