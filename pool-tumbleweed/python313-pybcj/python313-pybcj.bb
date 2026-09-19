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

RPM_NAME = "python313-pybcj-1.0.7-1.5.aarch64.rpm"
RPM_HASH = "fcb31368100c4cc1be78072eb4d8458f19a1706662e17307c467acecec8ae34ddcbd55735102271c6e8cc7222b8c875e60338adb08edbff10f48b3868f748f72"

RPROVIDES:${PN} += "python3-pybcj \
python3.13dist-pybcj \
python313-pybcj \
python3dist-pybcj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
