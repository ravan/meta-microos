SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-diffimg-0.3.0-2.5.noarch.rpm"
RPM_HASH = "a62ead7a5f322fc88d09d8e01b61146349286d40bf37bbf12076aeb51892b1edbef2d3ec6be16d5d0a569c406ae82617f82a20e85bcde544510fec73837a75a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diffimg \
python3.13dist-diffimg \
python313-diffimg \
python3dist-diffimg"

RDEPENDS:${PN} += "python-abi \
python313-Pillow"

inherit rpm
