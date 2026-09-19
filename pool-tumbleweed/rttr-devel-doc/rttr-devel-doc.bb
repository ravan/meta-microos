SUMMARY = "Documentation for rttr"
DESCRIPTION = "API Documentation for rttr"
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "rttr-devel-doc-0.9.6-6.5.aarch64.rpm"
RPM_HASH = "9dfa1504683217ac9e0ab7be1836c9992025070d6d8420f5438b4ee7fcab85a35707be3353814775c66494662db694ced8c5c354a381ddfaec2da9206480e102"

RPROVIDES:${PN} += "rttr-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
