SUMMARY = "HTML documentation for shorewall configuration"
DESCRIPTION = "HTML documentation for the Shoreline Firewall. Highly recommend to read before \
starting to configure shorewall"
LICENSE = "GFDL-1.1-only"

PV = "5.2.8"

RPM_NAME = "shorewall-docs-5.2.8-6.13.noarch.rpm"
RPM_HASH = "b131449236e287e631bbece9b58ad0ce21c65bc303aea4d084acc91a3632dbd08c27e30eb0fcfc1e2882fd697936ece0d949d4611ff5e4efc8739bbf40e8c7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-docs"

RDEPENDS:${PN} += ""

inherit rpm
