SUMMARY = "Source code of ispell dicts packages"
DESCRIPTION = "This package includes the source code of various ispell \
dicts packages for completeness."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & SUSE-Permissive & LGPL-2.1-only & MPL-1.1 & CC-BY-SA-1.0"

PV = "1.5"

RPM_NAME = "dicts-devel-1.5-426.1.noarch.rpm"
RPM_HASH = "9e2914b1a2cc12042a6fcc1f5d711a0d393e040cbb6bed6b915151c058cee5056c843add1abb88ecbd11db156ce8aff026ddc9b96d7007e03fbc237557350903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dicts-/usr/src/dicts/fix8bit.c \
dicts-devel"

RDEPENDS:${PN} += "/usr/bin/awk"

inherit rpm
