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

RPM_NAME = "python314-dukpy-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "13a1b3f2ceac6f8a2fed0477e1897c810379a09cb1fcfdfd358f65e39658fe1e27e77a16aa874b63a5e64d25efb9b379e2beff5050dabcfca10a602c30b1fb8c"

RPROVIDES:${PN} += "python3.14dist-dukpy \
python314-dukpy \
python3dist-dukpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
