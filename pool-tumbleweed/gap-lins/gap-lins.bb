SUMMARY = "GAP: Algorithm for computing the normal subgroups of a finitely presented group"
DESCRIPTION = "This package provides an algorithm for computing the normal \
subgroups of a finitely presented group up to some given index \
bound."
LICENSE = "GPL-2.0-or-later"

PV = "0.9"

RPM_NAME = "gap-lins-0.9-1.6.noarch.rpm"
RPM_HASH = "243ae3f308d61fdf214257504528446732e4bc1781ea7e5780a5fc9fb931258401d9b2133252cb4f5a8e9f0f4ff93fb23f54dcdd6706e2c048fe0c1c1241931b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-lins"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core"

inherit rpm
