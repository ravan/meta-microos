SUMMARY = "Collection of algorithms for computer vision"
DESCRIPTION = "OpenCV means Intel Open Source Computer Vision Library. It is a collection of C \
functions and a few C++ classes that implement some popular Image Processing and \
Computer Vision algorithms."
LICENSE = "BSD-3-Clause & GPL-2.0-only & Apache-2.0"

PV = "4.13.0"

RPM_NAME = "opencv-nogui-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "ce1f0e66ea06d1c5440b6cf13550557d47ad8afb2fe693ba4b36e56f17d85be593b592ed62f84635cf107d624e76d85dfc756ae81d33540d37a2859c68912f11"

RPROVIDES:${PN} += "opencv \
opencv-nogui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libstdc++.so.6"

inherit rpm
