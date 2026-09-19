SUMMARY = "Configuration files for Apache 2.4 to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for Apache 2.4 to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20260707.78c4c29"

RPM_NAME = "docserv-config-apache2-20260707.78c4c29-1.2.noarch.rpm"
RPM_HASH = "c7988678ebbe19a1a45961f80c28a5ba7ecd1941b6e8f7405e297aae1f091039835512327d02d8c2ce699d663738f3c0fbb18bc304b07cab25dff18c4ca0f8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-apache2"

RDEPENDS:${PN} += ""

inherit rpm
