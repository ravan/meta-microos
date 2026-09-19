SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "python313-Bottleneck-1.4.2-3.7.aarch64.rpm"
RPM_HASH = "59a3f7cccccab9060fe361567efd4dacffbbb788fdfbba0a04459fd1c015cdb0102cd53ea2c59d5403cca5dd5231a88431b9de2139541ea2e752094421e0e18a"

RPROVIDES:${PN} += "python3-Bottleneck \
python3.13dist-bottleneck \
python313-Bottleneck \
python3dist-bottleneck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy"

inherit rpm
