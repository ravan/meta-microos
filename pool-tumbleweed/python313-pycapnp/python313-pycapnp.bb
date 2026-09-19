SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-pycapnp-2.0.0-3.11.aarch64.rpm"
RPM_HASH = "2beb282b84b53ea2dcfc8a121fd811598ac3ccbb93b9d23157e5ee631d8d47db9c6953a0066bbb0fe6f3787e77e74ea1c6f68441397950d428b495f09315452a"

RPROVIDES:${PN} += "python3-pycapnp \
python3.13dist-pycapnp \
python313-pycapnp \
python3dist-pycapnp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp-rpc.so.1.5.0 \
libcapnp.so.1.5.0 \
libcapnpc.so.1.5.0 \
libgcc-s.so.1 \
libkj-async.so.1.5.0 \
libkj.so.1.5.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
