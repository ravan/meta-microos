SUMMARY = "Python bindings for the Thrift software framework"
DESCRIPTION = "Python bindings for the Thrift software framework, including the \
fastbinary C accelerator module."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "python314-thrift-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "47c98d414f22531664341a2a39a5171cedb0efdc81413701d0f4ebbdca55325095c4163f5f046d62b3b81d836077edaaddd581b96a201187b52781ff777db32f"

RPROVIDES:${PN} += "python3.14dist-thrift \
python314-thrift \
python3dist-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
