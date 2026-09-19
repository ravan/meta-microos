SUMMARY = "GAP: Interface to 4ti2"
DESCRIPTION = "This package provides a GAP module to interface with 4ti2, \
a collection of programs that compute and solve algebraic, \
geometric and combinational problems on linear spaces."
LICENSE = "GPL-2.0-only"

PV = "2026.05.01"

RPM_NAME = "gap-4ti2interface-2026.05.01-1.2.noarch.rpm"
RPM_HASH = "30ac53dc03f7cf3065ed331d720112a7e2a6b7225f5a781f471cb465b9e65970c3fbbf37fc4c538583346cb5e87a6da506e435a402273ee147641a906dba89bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-4ti2interface"

RDEPENDS:${PN} += "/usr/bin/sh \
4ti2 \
gap-core \
gap-io"

inherit rpm
