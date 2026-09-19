SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libcamera-base0_7-0.7.2-1.2.aarch64.rpm"
RPM_HASH = "800a483139c3182279b6a2e92e8a5a26bd2612d541ca83ce1f3a2db97ab48d1325693148b885c634f9fca26d78383681d2167e775b29b67118b1b16721f73f46"

RPROVIDES:${PN} += "libcamera-base.so.0.7 \
libcamera-base0-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
