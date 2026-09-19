SUMMARY = "Shared libraries for fastjet core package"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. It includes fast native implementations of many sequential \
recombination clustering algorithms, plugins for access to a range of \
cone jet finders and tools for advanced jet manipulation. \
 \
It provides a fast implementation of several \
longitudinally invariant sequential recombination jet algorithms, in \
particular the longitudinally invariant kt jet algorithm, the \
inclusive longitudinally invariant version of the Cambridge/Aachen \
jet-algorithm, and the inclusive anti-kt algorithm. \
 \
This package provides the shared libraries for fastjet and its \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "libfastjet0-3.5.1-2.1.aarch64.rpm"
RPM_HASH = "3c455516de50dc607d59fc8c8cbf6c2884a479fe49dceda993916fa4fbd6de5f5df8327428f688679f5e3cf3d978d5555b02300c21fb4e79f7520bdc4e9305a3"

RPROVIDES:${PN} += "libfastjet.so.0 \
libfastjet0 \
libfastjetplugins.so.0 \
libfastjettools.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libsiscone-spherical.so \
libsiscone.so.0 \
libstdc++.so.6"

inherit rpm
