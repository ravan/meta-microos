SUMMARY = "Artificial neural network library"
DESCRIPTION = "FANN is a neural network library which implements multilayer \
artificial neural networks in C with support for both fully connected \
and sparsely connected networks. Execution in both fixed and floating \
point are supported. It includes a framework for easy handling of \
training data sets."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libfann2-2.2.0-4.6.aarch64.rpm"
RPM_HASH = "0fdc50dca0a4d43959928752a611de8f2636a0ae0242acb91855024f13e2464bf8207c57be5031d4ad9b8529e522b1f12190977145e7fad7e0b8e97f8a054519"

RPROVIDES:${PN} += "libdoublefann.so.2 \
libfann.so.2 \
libfann2 \
libfixedfann.so.2 \
libfloatfann.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
