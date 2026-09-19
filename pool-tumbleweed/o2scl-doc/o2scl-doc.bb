SUMMARY = "Documentation for o2scl"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
This package provides the documentation for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.930.1"

RPM_NAME = "o2scl-doc-0.930.1-3.2.noarch.rpm"
RPM_HASH = "d7aaa1523ae302142b8fcc587c6f4856666874a2a10ed81010e2168990808c09e203a7631d002546a36df7ba9ff993856c92aa36c027574c0709633ce51eaa14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "o2scl-doc"

RDEPENDS:${PN} += ""

inherit rpm
