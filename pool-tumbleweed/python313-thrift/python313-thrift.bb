SUMMARY = "Python bindings for the Thrift software framework"
DESCRIPTION = "Python bindings for the Thrift software framework, including the \
fastbinary C accelerator module."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "python313-thrift-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "d17064ea1d97a932c3609239d310518081243de6f73f73c938b956f6505a2ba5b13664615d23515e3b7840975db9b43887eb24af22098a1e803abc172e288705"

RPROVIDES:${PN} += "python3-thrift \
python3.13dist-thrift \
python313-thrift \
python3dist-thrift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
