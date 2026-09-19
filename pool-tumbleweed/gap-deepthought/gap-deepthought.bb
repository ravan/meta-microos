SUMMARY = "GAP: Deep Thought for computations in nilpotent groups"
DESCRIPTION = "This package provides functions for multiplication and other \
computations in finitely generated nilpotent groups based on the Deep \
Thought algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "gap-deepthought-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "c84869a11d58d75a281cf36ace44fd78ad13c415683a71ca50e157a0b0690c2cccefb39e69ebb5ded15c56c04ccda14818fd52c1d5d6348254cb86ee59e5881c"

RPROVIDES:${PN} += "gap-deepthought"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-polycyclic"

inherit rpm
