SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-diffimg-0.3.0-2.5.noarch.rpm"
RPM_HASH = "8902a34bfb58070b866111cc605b6d06f48874adc0cb8936d70215da8ad5cd40bfae074e18ca3fc83d043276d1f46a9ca95e4f5d4c40fd354feb94d456193977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-diffimg \
python314-diffimg \
python3dist-diffimg"

RDEPENDS:${PN} += "python-abi \
python314-Pillow"

inherit rpm
