SUMMARY = "An advanced multi monitor wallpaper manager"
DESCRIPTION = "Cross-platform wallpaper manager that focuses on multi-monitor support. \
Features include ppi corrections, keyboard shortcuts, and slideshow."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "superpaper-2.2.1-1.10.noarch.rpm"
RPM_HASH = "acb72b5d4a560cc8fee709e4491fdccbdc022a868451a82bab5680de2bad08cf3105ce72ae09f35d65958891757d6457e82cc40fbb7774b46dbb1af6a01760ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-superpaper \
python3.13dist-superpaper \
python38-superpaper \
python3dist-superpaper \
superpaper"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Pillow \
python3-numpy \
python3-screeninfo \
python3-system-hotkey \
python3-wxPython \
python3-xcffib \
python3-xpybutil"

inherit rpm
