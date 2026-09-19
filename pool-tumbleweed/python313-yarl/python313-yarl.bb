SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.24.5"

RPM_NAME = "python313-yarl-1.24.5-1.1.aarch64.rpm"
RPM_HASH = "0228a631bd01ed2cb3cc329daf3f7c6f567d1f6af334e7a31a06eb102ee354693a2710d993a790506006d528f5b431bfc68e82433ba2bcbac156c209b24bf13d"

RPROVIDES:${PN} += "python3-yarl \
python3.13dist-yarl \
python313-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-idna \
python313-multidict \
python313-propcache"

inherit rpm
