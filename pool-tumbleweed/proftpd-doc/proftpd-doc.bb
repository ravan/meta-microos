SUMMARY = "Documentation for ProFTPD"
DESCRIPTION = "Here are Documentation for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-doc-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "ef916eaa8af29fa52095e726330e06f47a8b8dbbc45e3309929591cbdb2255e56b6ed92631aa07b989f89bf334189d07bd58b6ac36259844600390f0147bf786"

RPROVIDES:${PN} += "proftpd-doc"

RDEPENDS:${PN} += "proftpd"

inherit rpm
