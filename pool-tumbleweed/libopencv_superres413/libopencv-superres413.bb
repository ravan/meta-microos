SUMMARY = "Superresolution libraries for OpenCV"
DESCRIPTION = "Superresolution libraries for OpenCV"
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libopencv_superres413-4.13.0-2.1.aarch64.rpm"
RPM_HASH = "8b92394cbb1807c42f0c85501e238b97ef04429ff7338e3e99161467b33fb29afac18047fb3ff3a9930bc1b9775ee7ce50063b431446bfc39fddebacbd944d24"

RPROVIDES:${PN} += "libopencv-superres.so.413 \
libopencv-superres413"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopencv-optflow.so.413 \
libopencv-video.so.413 \
libopencv-videoio.so.413 \
libstdc++.so.6"

inherit rpm
