SUMMARY = "Performance Co-Pilot archive tools for importing MTRG data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing MTRG data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-import-mrtg2pcp-6.3.8-3.1.noarch.rpm"
RPM_HASH = "753e61d30001f38422fa98e2a1286034663daf40aabf189da75cd8438dc325b5cd34a813a60979d1dd5d8ab987eeaa31124ea8f18960382afd96a3a9fc2889fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-import-mrtg2pcp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-PCP-LogImport"

inherit rpm
