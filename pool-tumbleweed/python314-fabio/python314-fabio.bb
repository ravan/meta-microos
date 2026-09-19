SUMMARY = "Image IO for images produced by 2D X-ray detectors"
DESCRIPTION = "FabIO is an I/O library for images produced by 2D X-ray detectors."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "2025.10.0"

RPM_NAME = "python314-fabio-2025.10.0-1.4.aarch64.rpm"
RPM_HASH = "1fd142d52b1be073a41d06175674c881c422dfe59ba834ec8752da9975cd2f30613cdeaba2641faae3d7ed4b59094d105fd9d0c49537fbd24a04cb5d58a5e673"

RPROVIDES:${PN} += "python3.14dist-fabio \
python314-fabio \
python3dist-fabio"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
libc.so.6 \
libm.so.6 \
python-abi \
python314-Pillow \
python314-h5py \
python314-hdf5plugin \
python314-lxml \
python314-numpy \
update-alternatives"

inherit rpm
