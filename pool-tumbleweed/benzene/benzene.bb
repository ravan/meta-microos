SUMMARY = "Generator for nonisomorphic fusenes and benzenoids"
DESCRIPTION = "Benzene is a program for the efficient generation of all \
nonisomorphic fusenes and benzenoids with a given number of faces. \
Fusenes are planar polycyclic hydrocarbons with all bounded faces \
hexagons. Benzenoids are fusenes that are subgraphs of the hexagonal \
lattice."
LICENSE = "GPL-2.0-or-later"

PV = "20130630"

RPM_NAME = "benzene-20130630-2.5.aarch64.rpm"
RPM_HASH = "3759f522bd4a1047b064c01c43ca4133bc52224fe3f1442a13af12fb8fe26788cc9d9152ad7223048be368e9b5398b51fa01d03c92f88c5ceab942913ade67dc"

RPROVIDES:${PN} += "benzene"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
