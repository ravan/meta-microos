SUMMARY = "Performance Co-Pilot archive tools for importing iostat data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing iostat data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-import-iostat2pcp-6.3.8-3.1.noarch.rpm"
RPM_HASH = "be7a19e9fb8eff8c75b4663dbcb819b71c75569c1d420530505c355eef883dadf0d784d6ed90c36e3c0e994e593493d1ed95384f71ff0574fc72dc2b7a537468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-import-iostat2pcp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-PCP-LogImport \
sysstat"

inherit rpm
