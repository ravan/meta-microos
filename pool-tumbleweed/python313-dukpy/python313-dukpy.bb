SUMMARY = "JavaScript interpreter for Python"
DESCRIPTION = "DukPy is a javascript interpreter for Python built on top of \
duktape engine. \
It comes with a bunch of common transpilers built-in for convenience: \
 \
    - CoffeeScript \
    - BabelJS \
    - TypeScript \
    - JSX \
    - LESS"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python313-dukpy-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "a0b3852009e9ee3531dfaa3a99b4ec2f6e708a77f31afdd9cb7f46278ba59b045b6b9cd185037b23d6c499e202c6e5c72d2b5fe007ff2b497d6ca155a772eb67"

RPROVIDES:${PN} += "python3-dukpy \
python3.13dist-dukpy \
python313-dukpy \
python3dist-dukpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
