SUMMARY = "Dynamic Time Warping (DTW) package"
DESCRIPTION = "Library for time series distances (e.g. Dynamic Time Warping, DTW)."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "python313-dtaidistance-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "5152b52579532cfd79f3b51350847934708501741dd9c404860a1255f4042569bd623dd2fd5a9b1eddd5bd1f9bbfd3d1105c954a0761e318b568bee2447e623c"

RPROVIDES:${PN} += "python3-dtaidistance \
python3.13dist-dtaidistance \
python313-dtaidistance \
python3dist-dtaidistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
python-abi \
python313-numpy"

inherit rpm
