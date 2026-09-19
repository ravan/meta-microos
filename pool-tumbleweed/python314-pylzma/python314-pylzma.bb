SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.6.1"

RPM_NAME = "python314-pylzma-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "e82e958552f45fcb841fbf4dfb09217cfddbcf3f3b65e04682f4543d34d67e64d799b495c967988f15fefa6ad316334507b61c472d21bbff77669de80a456b36"

RPROVIDES:${PN} += "python3.14dist-pylzma \
python314-pylzma \
python3dist-pylzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
