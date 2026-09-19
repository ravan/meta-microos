SUMMARY = "YaST Server Utilities"
DESCRIPTION = "YaST tools for server system administration."
LICENSE = "MIT"

PV = "20260219"

RPM_NAME = "patterns-yast-yast2_server-20260219-1.2.aarch64.rpm"
RPM_HASH = "a111decc732f64a6773ba4f76c15441406bc131884a02dd9514985120bf099ed831df848b9993a489fa2325facfdfa36350e1c6bd5f20002fbf10e306a479cbd"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-yast2-server"

RDEPENDS:${PN} += "yast2-installation \
yast2-ldap \
yast2-network \
yast2-security \
yast2-services-manager \
yast2-sysconfig \
yast2-transfer \
yast2-tune \
yast2-users"

inherit rpm
