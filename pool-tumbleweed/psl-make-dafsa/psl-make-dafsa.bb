SUMMARY = "Tool to create a binary DAFSA from a Public Suffix List"
DESCRIPTION = "psl-make-dafsa converts ASCII string into C source or a binary format, \
The format used is DAFSA, deterministic acyclic finate state automaton. \
 \
libpsl is capable of using this compact binary form of the Public Suffix List (PSL). \
 \
This package is a build dependency for the publicsuffix package."
LICENSE = "BSD-3-Clause"

PV = "0.23.3"

RPM_NAME = "psl-make-dafsa-0.23.3-1.1.noarch.rpm"
RPM_HASH = "46b5140b2d9cc56a37cc1c542d2db74c487f33751adcc8a71109ac9893002731cbf84722705e87bc67e574de2e9a286f80dc82ad5f5d58540de05db7874d1c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psl-make-dafsa"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base"

inherit rpm
