SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python314-mss-10.1.0-1.3.noarch.rpm"
RPM_HASH = "6166be67f82d6aa82b3a2b059d30fe489b99cbf357057524739c21eeca78970548835bad1ba346081db6ca99eab91de7406a06e06649173a523fb02438e87b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mss \
python314-mss \
python3dist-mss"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pillow \
python314-numpy \
xrandr"

inherit rpm
