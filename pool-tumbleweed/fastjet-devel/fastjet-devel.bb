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
This package provides the header files for development with fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "fastjet-devel-3.5.1-2.1.aarch64.rpm"
RPM_HASH = "1f7aeda5524f1d692b20a7d3df8cd9e5c42783a67d0b5decffc035bd41bdc7cb00a37aae35279bce80e32b5bb67aaf95305c76b9d4345726e318b94965e4b5a3"

RPROVIDES:${PN} += "cmake-fastjet \
fastjet-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
cgal-devel \
libfastjet0"

inherit rpm
