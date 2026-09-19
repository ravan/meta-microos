SUMMARY = "Library for commandline flag processing"
DESCRIPTION = "The gflags package contains a library that implements commandline \
flags processing. As such, it is a replacement for getopt(). It has \
increased flexibility, including built-in support for C++ types like \
string, and the ability to define flags in the source file in which \
they're used."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-2.2.2-4.9.aarch64.rpm"
RPM_HASH = "a85110765a623280c7329392fa46ef5cd8d6701a2f4757896c3d07bfee8f83661fec35b0d7bf0e49445e920131d039242b72b898bbe824d754a04d23db306151"

RPROVIDES:${PN} += "gflags"

RDEPENDS:${PN} += "/usr/bin/bash \
libgflags2-2"

inherit rpm
