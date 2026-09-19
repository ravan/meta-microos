SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.26.0"

RPM_NAME = "python314-scikit-image-0.26.0-3.1.aarch64.rpm"
RPM_HASH = "e899d27416051447ede54263d6f3ebe5d1045ee791f05cb5adc0aa3f4f279a7375f9bae620217f390eccdc55ed2b90fa4758f408fa8cb360c11f388b80e23fc1"

RPROVIDES:${PN} += "python3.14dist-scikit-image \
python314-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-Pillow \
python314-imageio \
python314-lazy-loader \
python314-networkx \
python314-numpy \
python314-packaging \
python314-scipy \
python314-tifffile \
update-alternatives"

inherit rpm
