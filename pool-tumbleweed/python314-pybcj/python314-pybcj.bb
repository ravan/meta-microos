SUMMARY = "A bcj filter library"
DESCRIPTION = "In data compression, BCJ, short for Branch-Call-Jump, refers to a technique that \
improves the compression of machine code of executable binaries by replacing \
relative branch addresses with absolute ones. This allows a LZMA compressor to \
identify duplicate targets and archive higher compression rate. \
 \
BCJ is used in 7-zip compression utility as default filter for executable binaries. \
 \
pybcj is a python bindings with BCJ implementation by C language. The C codes are \
derived from p7zip, portable 7-zip implementation. pybcj support Intel/Amd \
x86/x86_64, Arm/Arm64, ArmThumb, Sparc, PPC, and IA64."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.7"

RPM_NAME = "python314-pybcj-1.0.7-1.5.aarch64.rpm"
RPM_HASH = "b554b2d7e91365042b397214766d9c977f7e752a8dfeae5851c55216d2e1d5cc9175624a0beedc07dfdbd879f8c41155f27b4df7a3bb8e330dbab79eb289f813"

RPROVIDES:${PN} += "python3.14dist-pybcj \
python314-pybcj \
python3dist-pybcj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
