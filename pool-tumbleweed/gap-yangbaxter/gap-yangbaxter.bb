SUMMARY = "GAP: Combinatorial Solutions for the Yang-Baxter equation"
DESCRIPTION = "The YangBaxter package provides functionality to construct classical \
and skew braces. It also includes a database of classical and skew \
braces of small orders."
LICENSE = "GPL-3.0-only"

PV = "0.10.7"

RPM_NAME = "gap-yangbaxter-0.10.7-1.4.noarch.rpm"
RPM_HASH = "4c080438496da0b95db76cb066324970eda857f8581277550879741dbffb23a059fe87588e23561195e8b5f0b5e0ff4f8ffb111cf03f33a08d491d90fc303e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-yangbaxter"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-cryst"

inherit rpm
