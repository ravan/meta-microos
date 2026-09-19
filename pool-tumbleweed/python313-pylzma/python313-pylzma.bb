SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.6.1"

RPM_NAME = "python313-pylzma-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "ca70aec4b65125af08a1b34e3432bc207e396a808167935fd0e4dfd5002ace6fc1c7a1b02b3381751fd464fb499b28295a8cc3b95a5bdc67a0766bf16d8187b8"

RPROVIDES:${PN} += "python3-pylzma \
python3.13dist-pylzma \
python313-pylzma \
python3dist-pylzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
