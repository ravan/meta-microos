SUMMARY = "Cartographic projection software"
DESCRIPTION = "This package offers the commandline tools for performing respective \
forward and inverse transformation of cartographic data to or from cartesian \
data with a wide range of selectable projection functions."
LICENSE = "MIT"

PV = "9.8.1"

RPM_NAME = "proj-9.8.1-2.3.aarch64.rpm"
RPM_HASH = "9c9e0fa673e75235fb2ef917d8a392dcc34f0cfd776f60c88cb133049381dd474b4459e6b8670228f4182d92ae1ba498072d5ffdc0de73821e31b20a3134de5e"

RPROVIDES:${PN} += "libproj \
proj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libproj.so.25 \
libstdc++.so.6"

inherit rpm
