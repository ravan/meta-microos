SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python313-mss-10.1.0-1.3.noarch.rpm"
RPM_HASH = "4ab4d308a4f16f34ad4803ee43b932c918c4b918b000134456c36ee6c99b748ebdaa2daa2f06b0e040d8ab9afae9d882d293336df24da44bad6306962eedb7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mss \
python3.13dist-mss \
python313-mss \
python3dist-mss"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-numpy \
xrandr"

inherit rpm
