SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "python313-html5-parser-0.4.12-2.8.aarch64.rpm"
RPM_HASH = "8ea087cac389c832e41a000eb0f04df232f14b17dd1672bed72aecb55f5f8e44620160a8408e7dda6896651325e83be10dd81c365dd7dd552989e1203859be74"

RPROVIDES:${PN} += "python3-html5-parser \
python3.13dist-html5-parser \
python313-html5-parser \
python3dist-html5-parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
python-abi"

inherit rpm
