SUMMARY = "Performance Co-Pilot archive tools for importing sar data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing sar data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-import-sar2pcp-6.3.8-3.1.noarch.rpm"
RPM_HASH = "2818ebe77e4c0d623c3ea15d3bc959a7db111eb55eda70ea91153671911888107bd49ba7b11bd921bb01586dea22516fd568355b23a4ab87de9ed16393c46b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-import-sar2pcp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-PCP-LogImport \
sysstat"

inherit rpm
