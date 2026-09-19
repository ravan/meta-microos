SUMMARY = "NETGEN python bindings"
DESCRIPTION = "Python bindings for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "python3-netgen-6.2.2602-3.5.aarch64.rpm"
RPM_HASH = "98be8b7aac777348a1a00ae5b42f4bb1d70e67d23f06f1c3e2c7d366ee65a2e11a2d26a8105947415f9a352598dac3ffe8e96cc7a049db7ea152f857edc2ff43"

RPROVIDES:${PN} += "libngguipy.so \
libngpy.so \
netgen-/usr/lib64/python3.13/site-packages/netgen/libngpy.so \
python3-netgen \
python3.13dist-netgen-mesher \
python3dist-netgen-mesher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libngcore.so.6.2.2602 \
libnggui.so.6.2.2602 \
libnglib.so.6.2.2602 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
