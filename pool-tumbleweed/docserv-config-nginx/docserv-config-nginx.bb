SUMMARY = "Configuration files for nginx to serve docserv directory"
DESCRIPTION = "This package contains example configuration files for nginx to act as web server for docserv manpages."
LICENSE = "Apache-2.0"

PV = "20260707.78c4c29"

RPM_NAME = "docserv-config-nginx-20260707.78c4c29-1.2.noarch.rpm"
RPM_HASH = "f510447e4e37f2502222b4b338bf056e94a5a4c2354c159b0e0e0b220438684f0ab4c4537105f36157531f6e74b65c13ff04ca5753593c220e37b939e37714c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docserv-config-nginx"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
