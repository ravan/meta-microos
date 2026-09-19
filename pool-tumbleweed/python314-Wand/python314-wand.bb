SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python314-Wand-0.7.2-1.2.noarch.rpm"
RPM_HASH = "feb395cba85facec8c8f3044119695b89c3dcba0d7dda01a4002905649851c75e93d4820dfe91d406468fba8edadf7152b535f2b768b4abec55db3ab6e379e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wand \
python314-Wand \
python3dist-wand"

RDEPENDS:${PN} += "ImageMagick \
python-abi"

inherit rpm
