SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.23.0"

RPM_NAME = "python314-libsass-0.23.0-3.7.aarch64.rpm"
RPM_HASH = "5c8c7610f0414d3cbe29428219e604ff60c7451d451dabe655674378565c01956669f999de66f29b53b889d18a7b0c2e3bd10cd0b11bce962bd8ce8a8a4f7391"

RPROVIDES:${PN} += "python3.14dist-libsass \
python314-libsass \
python3dist-libsass"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsass-3.6.6.so.1 \
python-abi \
python314-setuptools"

inherit rpm
