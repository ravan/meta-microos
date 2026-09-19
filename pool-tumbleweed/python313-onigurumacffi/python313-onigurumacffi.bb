SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-onigurumacffi-1.5.0-1.6.aarch64.rpm"
RPM_HASH = "1745b992e537fd9b01cb04c56e79c167f6c96fc721916515ed8bcdc46ec9341f0012b57c187d8cbb0b6799eb9e4244215fab843a2e4b4f384af8954f5c1195a7"

RPROVIDES:${PN} += "python3-onigurumacffi \
python3.13dist-onigurumacffi \
python313-onigurumacffi \
python3dist-onigurumacffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libonig.so.5 \
python-abi \
python313-cffi"

inherit rpm
