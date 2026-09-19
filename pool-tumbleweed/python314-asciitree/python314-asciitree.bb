SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python314-asciitree-0.3.3-5.5.noarch.rpm"
RPM_HASH = "86d31a205bce61495ba6d72b29828aabae37bcde69a00f1f8b6e4daf4f05b38545da0cf2f17f8aafaa3190ba604da50be46c1f200dcd4cc64bfdcedef75426b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asciitree \
python314-asciitree \
python3dist-asciitree"

RDEPENDS:${PN} += "python-abi"

inherit rpm
