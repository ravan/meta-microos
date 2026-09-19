SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ca-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "79fd3c03565ecc6bf2cdf616978d9ebefc7b57ec32e8fef751068ae6cdb20101c337a6d51b1b1cffa174e22bb81af05bb18df96e29980373c427e9cccaef38c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
