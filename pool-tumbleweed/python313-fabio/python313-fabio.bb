SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "2025.10.0"

RPM_NAME = "python313-fabio-2025.10.0-1.4.aarch64.rpm"
RPM_HASH = "dc11499e14d68e867e9809b56740c6580887404f938bbd59419b2bef863baba31be8c103eeb51f1dfd275858d0ae3770c4fc319a83a2db829586341bf66ae34e"

RPROVIDES:${PN} += "python3-fabio \
python3.13dist-fabio \
python313-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
libm.so.6 \
python-abi \
python313-Pillow \
python313-h5py \
python313-hdf5plugin \
python313-lxml \
python313-numpy \
update-alternatives"

inherit rpm
