SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-lustre-6.3.8-3.1.noarch.rpm"
RPM_HASH = "4e47093c0669089e1998045c4a23625cea327106a16d5f15973dd9ebfea942271f96389a6fb15499e2c3585601aa1451d1c7fad0d326589dcd09a63c2cefa29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-lustre \
pcp-pmda-lustre"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
