SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-humanreadable-0.4.3-1.2.noarch.rpm"
RPM_HASH = "01d319412029da8e7b5317e117969bf55384f6966077c3ac6807415fe627446667480a11bf1cbb2540b46ee11b253b3c5166b7903b81c38173363fccd5108e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanreadable \
python3.13dist-humanreadable \
python313-humanreadable \
python3dist-humanreadable"

RDEPENDS:${PN} += "python-abi \
python313-typepy"

inherit rpm
