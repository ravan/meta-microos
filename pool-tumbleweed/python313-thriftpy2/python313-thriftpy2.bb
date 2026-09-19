SUMMARY = "Pure python implementation of Apache Thrift"
DESCRIPTION = "ThriftPy is a pure python implementation of Apache Thrift in a \
pythonic way."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-thriftpy2-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "bfb40a61cd19fef65e3061034c757fbe84e3719a54f64d0526fd9830ab3f89fac0d2123c7ab0e9bf26feaa9476a8552f1da83dd1961e1d7a1a84574710c3db19"

RPROVIDES:${PN} += "python3-thriftpy2 \
python3.13dist-thriftpy2 \
python313-thriftpy2 \
python3dist-thriftpy2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-ply \
python313-six"

inherit rpm
