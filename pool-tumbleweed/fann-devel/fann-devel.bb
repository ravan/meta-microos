SUMMARY = "Development package for fann, an artificial neural network library"
DESCRIPTION = "FANN is a neural network library which implements multilayer \
artificial neural networks in C with support for both fully connected \
and sparsely connected networks. \
 \
This subpackage contains the headers for FANN."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "fann-devel-2.2.0-4.6.aarch64.rpm"
RPM_HASH = "46caf0e01c56419ef839398df4365feb5753f12f3aed80945eb5ee4833172bd0f2624ada6e7554cc9ca493ee87c71943f8d5b6dc4cb92a25215026051900d786"

RPROVIDES:${PN} += "fann-devel \
libfann-devel \
pkgconfig-fann"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfann2 \
libstdc++-devel"

inherit rpm
