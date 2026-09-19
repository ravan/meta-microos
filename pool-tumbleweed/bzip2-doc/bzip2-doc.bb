SUMMARY = "The bzip2 program and Library Documentation"
DESCRIPTION = "The bzip2 program and library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "bzip2-doc-1.0.8-6.1.noarch.rpm"
RPM_HASH = "1c50f4cdd5d3616e129dd16540a22802ef66dca370ae3292b88d1c1f07a876292685a392ba58e6531d577c157d649e46b9ac93d43d4eeb5035f1eee309c7d065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bzip2-doc"

RDEPENDS:${PN} += ""

inherit rpm
