SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python3-pgmagick-0.8-1.6.aarch64.rpm"
RPM_HASH = "d61c075e140098d1addec1871a1bfc4aa23a20ffb7f4d4bdadf781aaf490a105c11bcde3dc6f660646f76c7b643aee9b21ff449fd233d477822a24d43295e555"

RPROVIDES:${PN} += "python3-pgmagick \
python3.13dist-pgmagick \
python3dist-pgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGraphicsMagick++-Q16.so.12 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
