SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.2.5"

RPM_NAME = "python314-wheezy.template-3.2.5-1.5.aarch64.rpm"
RPM_HASH = "68d179920c5c952876d59221ddb1695198ad9415a99b0d6499cf4a7c69b4cfa4db8c9a0a44169428fc49285f68b0bb7f45012d172cfcb4404ea54ea046ca6737"

RPROVIDES:${PN} += "python3.14dist-wheezy.template \
python314-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
