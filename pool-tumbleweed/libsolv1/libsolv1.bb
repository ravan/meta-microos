SUMMARY = "Package dependency solver using a satisfiability algorithm"
DESCRIPTION = "libsolv is a library for solving packages and reading repositories. \
It consists of two central blocks: Using a dictionary approach to \
store and retrieve package and dependency information, and, using a \
so-called satisfiability algorithm for resolving package \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "libsolv1-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "0f635dfa9bd0bff77f7729ccf4c49a66132a043b76aeb1504f25cba060cf7a90328a7841791cf3b7eff743eb01892f0b4e892314129bfb3b8040191cdb1a21f1"

RPROVIDES:${PN} += "libsolv.so.1 \
libsolv1 \
libsolvext.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
