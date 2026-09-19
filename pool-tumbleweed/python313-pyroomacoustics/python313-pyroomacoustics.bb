SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-pyroomacoustics-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "4e4d39b1e780cdb145effc7db1970e31220ba01e0395ecec996e519a54d0f8ac051eba0ab24ca75b9842f28e932f158b30c57ad75a77bd635c159c3244c9fb0b"

RPROVIDES:${PN} += "libroom.cpython-313-aarch64-linux-gnu.so \
python3-pyroomacoustics \
python3.13dist-pyroomacoustics \
python313-pyroomacoustics \
python3dist-pyroomacoustics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-Cython \
python313-numpy \
python313-pybind11 \
python313-scipy"

inherit rpm
