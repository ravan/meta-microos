SUMMARY = "Command-line interfaces for libcamera"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
'cam' is a command-line utility to interact with cameras. It allows \
to query and set image stream properties, and to capture the stream \
to a file or show a live view."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libcamera-cam-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "0ec9b1196260248c8bf4d198d4855c4bad24ec8f61759d863116d8f5c7a4508ffdfbb43c833af8d2ad9c0d26acfdc13579e6a9b3a327dca82b3900896006e64c"

RPROVIDES:${PN} += "libcamera-cam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libdrm.so.2 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libjpeg.so.8 \
libstdc++.so.6 \
libtiff.so.6 \
libyaml-0.so.2"

inherit rpm
