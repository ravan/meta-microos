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
This package provides shared libraries for SISCone plugin for \
fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "fastjet-plugin-siscone-3.5.1-2.1.aarch64.rpm"
RPM_HASH = "e40b7a59ed4ca390f8e64e5ad19918912a57e9997df53a5157c663a90f062f3ecb7abbc0e877850792681c39815ba982cc8566e99e64720037eec66a29d34294"

RPROVIDES:${PN} += "fastjet-plugin-siscone \
libsiscone.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
