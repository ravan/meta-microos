SUMMARY = "Curses-like terminal wrapper, with colored strings!"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python314-curtsies-0.4.3-1.5.noarch.rpm"
RPM_HASH = "ff8b660f6b7dd3805af8b2f6ecff61dd5d3453252ea0a7bcf845022854d84c57e49147558d3325b7a21b7bc7981692d9b01710f7c28389b4b6ee140fc8891941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-curtsies \
python314-curtsies \
python3dist-curtsies"

RDEPENDS:${PN} += "python-abi \
python314-blessed \
python314-cwcwidth"

inherit rpm
