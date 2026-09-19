SUMMARY = "Performance Co-Pilot archive tools for importing ganglia data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing ganglia data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-import-ganglia2pcp-6.3.8-3.1.noarch.rpm"
RPM_HASH = "9257129df1157fbe3782613f2df7661dd4e5707c89ac0c8cf784ce206f47b90ad60ff688c726d5edab185177da675a1cf26f2a536aabb403792763ca99e7d493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-import-ganglia2pcp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-PCP-LogImport"

inherit rpm
