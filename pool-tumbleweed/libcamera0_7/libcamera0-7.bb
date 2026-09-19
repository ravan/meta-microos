SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libcamera0_7-0.7.2-1.2.aarch64.rpm"
RPM_HASH = "286fe1792d37db074c8a577ec95014ab7ea0d66bbc9bd53bdadb60486c283c1f5ddcf8de4791af16f319a129f0588fe7f0aa21adb8245197128436a04727da74"

RPROVIDES:${PN} += "libcamera.so.0.7 \
libcamera0-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcamera-base.so.0.7 \
libgcc-s.so.1 \
libm.so.6 \
libpisp.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libyaml-0.so.2 \
libyuv.so.0"

inherit rpm
