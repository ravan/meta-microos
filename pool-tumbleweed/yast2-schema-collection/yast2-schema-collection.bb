SUMMARY = "Collection of yast2-schema autoyast XML definitions of released distributions"
DESCRIPTION = "Contains a collection of yast2-schema autoyast XML definitions of released distributions. \
Those are needed to be able to validate autoyast XML files you might want to use for auto installations"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1"

RPM_NAME = "yast2-schema-collection-0.0.1-2.14.noarch.rpm"
RPM_HASH = "a95a63aede2d994b2e592b6535097ff478f9650d885d6b22ee7cd114b6b8718c917242d931e4bdcaab1781b436f33c941072103923ef2de32d36dc913a04c50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-schema-collection"

RDEPENDS:${PN} += ""

inherit rpm
