SUMMARY = "Collection of algorithms for image processing in Python"
DESCRIPTION = "Scikit-image is a collection of algorithms for image processing in Python. \
It is available free of charge and free of restriction."
LICENSE = "BSD-3-Clause"

PV = "0.26.0"

RPM_NAME = "python313-scikit-image-0.26.0-3.1.aarch64.rpm"
RPM_HASH = "23ee6c87a9d04e5f5275501c7c9178fb31af6b7a69c32ed33ae530cba41b412562accc88460f404a67082db0998f4d31d9172b39d65b9d74ff60512f0e99a38a"

RPROVIDES:${PN} += "python3-scikit-image \
python3.13dist-scikit-image \
python313-scikit-image \
python3dist-scikit-image"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-Pillow \
python313-imageio \
python313-lazy-loader \
python313-networkx \
python313-numpy \
python313-packaging \
python313-scipy \
python313-tifffile \
update-alternatives"

inherit rpm
