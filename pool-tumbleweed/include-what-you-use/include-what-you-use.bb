SUMMARY = "A tool to analyze #includes in C and C++ source files"
DESCRIPTION = "'Include what you use' means this: for every symbol (type, function, \
variable, or macro) that you use in foo.cc (or foo.cpp), either foo.cc \
or foo.h should include a .h file that exports the declaration of that \
symbol. The include-what-you-use program is a tool to analyze includes \
of source files to find include-what-you-use violations, and suggest \
fixes for them. \
 \
The main goal of include-what-you-use is to remove superfluous includes. \
It does this both by figuring out what includes are not actually needed \
for this file (for both .cc and .h files), and replacing includes with \
forward declarations when possible."
LICENSE = "NCSA"

PV = "0.26"

RPM_NAME = "include-what-you-use-0.26-1.4.aarch64.rpm"
RPM_HASH = "1a8f6660bf86be38492ba6288ac1da149397270c20d686bd12490a7f5e5951bfcf775bd3e73919eb5e80a523651d0fa171629db0776fb56dff8bdc6978c426e4"

RPROVIDES:${PN} += "include-what-you-use"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libstdc++.so.6"

inherit rpm
