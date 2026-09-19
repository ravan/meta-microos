SUMMARY = "Performance Tools for C++"
DESCRIPTION = "The gperftools package contains some utilities to improve and analyze the \
performance of C++ programs.  This includes an optimized thread-caching \
malloc() and cpu and heap profiling utilities."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "gperftools-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "bd2fcc07194b955a1c493e68745cc8f6aa57b79dba5b347eefdce35d514f7615308a744e66ea640d3745beb53348f6684407e2e37ea267a22a27451b351451c7"

RPROVIDES:${PN} += "google-perftools \
gperftools"

RDEPENDS:${PN} += "pprof"

inherit rpm
