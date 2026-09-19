SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.7.6"

RPM_NAME = "python314-yappi-1.7.6-2.1.aarch64.rpm"
RPM_HASH = "e2cf99b99883bd577a6d7bd05ad2b8bcf15b98dbc6b776978824022bdbcfc28520f928a6b106686f22380fe6b2c35ea47fd85c361ed3b7c81f8a3e54e0e56cae"

RPROVIDES:${PN} += "python3.14dist-yappi \
python314-yappi \
python3dist-yappi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
