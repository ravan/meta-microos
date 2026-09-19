SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python314-dtaidistance-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "51f54647af5344b3d5996a2db83486684918120c3b1dfc7c1b677abe6134fac27215baf9c04d476dc42e31b5b20e15b3150127cf5a2686facc42896cf66b7ba7"

RPROVIDES:${PN} += "python3.14dist-dtaidistance \
python314-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi \
python314-numpy"

inherit rpm
