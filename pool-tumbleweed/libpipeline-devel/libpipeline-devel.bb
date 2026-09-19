SUMMARY = "A pipeline manipulation library"
DESCRIPTION = "libpipeline is a C library for setting up and running pipelines of \
processes, without needing to involve shell command-line parsing which \
is often error-prone and insecure. This alleviates programmers of the \
need to laboriously construct pipelines using lower-level primitives \
such as fork(2) and execve(2)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.8"

RPM_NAME = "libpipeline-devel-1.5.8-1.8.aarch64.rpm"
RPM_HASH = "8442320c0fb7eefac92d22c3ee09f05fd9a14f4375b4cf2df00018c0a64020a50159703cf8be94ac1244f3f0a0ae14c36f56db6508858c0b7ad6bedb26cd051e"

RPROVIDES:${PN} += "libpipeline-devel \
pkgconfig-libpipeline"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipeline1"

inherit rpm
