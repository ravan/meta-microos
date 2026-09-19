SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.23.0"

RPM_NAME = "python313-libsass-0.23.0-3.7.aarch64.rpm"
RPM_HASH = "6e57223ebc16c7878efd69905e069b54383c5da49cf0cc304ecc472458e646b5e8e0ea24ec381d35ba25cf61f6a943e8ccf3845c50818fd810598503f35100f2"

RPROVIDES:${PN} += "python3-libsass \
python3.13dist-libsass \
python313-libsass \
python3dist-libsass"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsass-3.6.6.so.1 \
python-abi \
python313-setuptools"

inherit rpm
