SUMMARY = "Collection of telemetry decoders for GNU Radio"
DESCRIPTION = "gr-satellites is a GNU Radio out-of-tree module encompassing a collection of \
telemetry decoders that supports many different Amateur satellites."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & MIT"

PV = "5.9.0"

RPM_NAME = "gr-satellites-5.9.0-1.1.aarch64.rpm"
RPM_HASH = "18a34cbbac0e2aafb81ca64562a4453205d653401dec1c43b13ee675de1a201f975efa485675c425f0045fd26fd1351d98fff5e856cf996f96a5095064765ea1"

RPROVIDES:${PN} += "gr-satellites"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnuradio \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libgnuradio-satellites.so.5.9.0 \
libstdc++.so.6 \
python-abi \
python3-PyYAML \
python3-construct \
python3-matplotlib \
python3-numpy \
python3-pyzmq \
python3-requests \
python3-websocket-client"

inherit rpm
