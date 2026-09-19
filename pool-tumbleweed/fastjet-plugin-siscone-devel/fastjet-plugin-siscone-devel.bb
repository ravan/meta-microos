SUMMARY = "SISCone plugin for fastjet"
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
This package provides the develoment files for SISCone plugin for \
fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "fastjet-plugin-siscone-devel-3.5.1-2.1.aarch64.rpm"
RPM_HASH = "56d078f06a85a7a598a7944949af45c3ea1ad1b41b162ef1ead9f374af492bb9fca81f4329d63a678d8005bb28c59bfad54443ee020ec6b5edeeb1e0fca972f6"

RPROVIDES:${PN} += "cmake-siscone \
fastjet-plugin-siscone-devel \
libsiscone-spherical.so"

RDEPENDS:${PN} += "fastjet-devel \
fastjet-plugin-siscone \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsiscone.so.0 \
libstdc++.so.6"

inherit rpm
