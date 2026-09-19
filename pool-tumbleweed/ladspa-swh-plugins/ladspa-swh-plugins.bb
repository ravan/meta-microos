SUMMARY = "LADSPA SWH plugins"
DESCRIPTION = "This package provides a collection of LADSPA (Linux Audio Developer's \
Simple Plug-in API) plugins written by Steve Harris."
LICENSE = "GPL-2.0+"

PV = "0.4.17"

RPM_NAME = "ladspa-swh-plugins-0.4.17-2.10.aarch64.rpm"
RPM_HASH = "5ddcfe6317ed84832425b707dfd6c041ce9dfd09c85dd04d5d9a47769860f9fdcd1581a2dc544f2d3741569ea421c8f2432fad5e531b0529d62df52bacc22c67"

RPROVIDES:${PN} += "ladspa-swh-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
