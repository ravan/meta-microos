SUMMARY = "A framework for room acoustics and audio processing in Python"
DESCRIPTION = "Pyroomacoustics is a package for audio signal processing for indoor \
applications. It was developed as a prototyping platform for \
beamforming algorithms in indoor scenarios."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-pyroomacoustics-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "29563b5ce60d64e4820345db3510fb2f97d26fee605297b39341b932a548d4b8d0341781c191f66a182b4438fa0303a5800c21b908ee52ca08ad6e09e16ad903"

RPROVIDES:${PN} += "libroom.cpython-314-aarch64-linux-gnu.so \
python3.14dist-pyroomacoustics \
python314-pyroomacoustics \
python3dist-pyroomacoustics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-Cython \
python314-numpy \
python314-pybind11 \
python314-scipy"

inherit rpm
