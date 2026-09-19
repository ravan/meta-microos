SUMMARY = "Development files for the ABI-relevant artifact library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences. \
 \
This subpackage contains the files needed to build programs with ABIGAIL."
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "2.10"

RPM_NAME = "libabigail-devel-2.10-1.3.aarch64.rpm"
RPM_HASH = "b063bd8bb7b646e4a6cc71aead10e946a6b259569190df54db3ee61678f874fa18cf7cd8f9a05e6f70d3dbe35994fb81956d254ab38789713dab38a9dbcf5ed3"

RPROVIDES:${PN} += "libabigail-devel \
pkgconfig-libabigail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libabigail9 \
pkgconfig-libxml-2.0"

inherit rpm
