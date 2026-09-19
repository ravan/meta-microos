SUMMARY = "A python library for writing pixel images and ASCII art to the terminal"
DESCRIPTION = "A Rich-compatible library for writing pixel images and other colourful \
grids to the terminal."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python313-rich-pixels-3.0.1-1.9.noarch.rpm"
RPM_HASH = "07d6ee5c514132c700d6391f4951c39d5118a707025813fb060956d2b9b82af8513695d9385bf5d8eef27f1dacfb304e82674cdbbfd269af12644225f268db64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich-pixels \
python3.13dist-rich-pixels \
python313-rich-pixels \
python3dist-rich-pixels"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-rich"

inherit rpm
