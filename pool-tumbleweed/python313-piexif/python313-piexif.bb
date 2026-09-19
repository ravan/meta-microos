SUMMARY = "To simplify exif manipulations with python. Writing, reading, and more"
DESCRIPTION = "To simplify exif manipulations with python. Writing, reading, and more."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python313-piexif-1.1.3-1.14.noarch.rpm"
RPM_HASH = "caf163492338d0f74372b0efd3778467b913ac8ace96ad315ae119bf50680bb0173e4659b6d827b94368c311f3b21a1c375e3a10c468b5ae08e15017e2af6d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-piexif \
python3.13dist-piexif \
python313-piexif \
python3dist-piexif"

RDEPENDS:${PN} += "python-abi"

inherit rpm
