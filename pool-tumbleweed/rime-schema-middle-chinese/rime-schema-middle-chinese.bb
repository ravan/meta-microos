SUMMARY = "Medieval chinese input schema for rime"
DESCRIPTION = "medieval chinese input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-middle-chinese-20250315-1.4.noarch.rpm"
RPM_HASH = "80961235869be2b9cbbcf9862fa5bcb829f1f74d36bed31d56c56b72d761575044b5088b15f64067ea8994c93e6a82283306ec8a9c2fbfdb694ac5a9aab363d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-middle-chinese"

RDEPENDS:${PN} += ""

inherit rpm
