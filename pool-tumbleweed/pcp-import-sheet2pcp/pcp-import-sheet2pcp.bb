SUMMARY = "Performance Co-Pilot archive tools for importing spreadsheet data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing spreadsheet data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-import-sheet2pcp-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "b8d2f70ad256d5a7bd5d5fd0d64c4945f069de70e58ab25cd0cdbffbc6ed02aed533208c5cf9055231c3320261f6d6d90324c8966666e06fa2be986e43362cf5"

RPROVIDES:${PN} += "pcp-import-sheet2pcp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-PCP-LogImport \
sysstat"

inherit rpm
