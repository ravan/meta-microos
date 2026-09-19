SUMMARY = "Documentation for performance tools for C++"
DESCRIPTION = "Documentation for gperftools package which contains some utilities to improve and analyze the \
performance of C++ programs"
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "gperftools-doc-2.18.1-1.4.noarch.rpm"
RPM_HASH = "402af5203a63185c247c3f3d7b5c120a02609287b7921c12cfdca2aaf418d5ad8e89ec6db9df7c8d33a55cec7eef83357c62fdf176e0d14227c4b651d68b07dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gperftools-doc"

RDEPENDS:${PN} += ""

inherit rpm
