SUMMARY = "Performance Co-Pilot run-time configuration"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time configuration"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "pcp-conf-6.3.8-3.1.noarch.rpm"
RPM_HASH = "ca450213a246aae4460e63db779e01c5d72b0414c8a45e741dccb6867bd00bc898f3fc804adf78b23e1a3315026997e2e884668ef59341a368eb830b0f0341e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-conf \
pcp-conf"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
