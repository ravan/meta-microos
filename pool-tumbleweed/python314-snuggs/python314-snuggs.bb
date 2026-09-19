SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python314-snuggs-1.4.7-4.12.noarch.rpm"
RPM_HASH = "9528258a6b75aa195390859831bb6c045a4b620a7e1a1ac5059b4ca9825cdaed479441cf58a800e95354de5b00959fdc8c3c3dac394252537de72ba2eeaae5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-snuggs \
python314-snuggs \
python3dist-snuggs"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-pyparsing"

inherit rpm
