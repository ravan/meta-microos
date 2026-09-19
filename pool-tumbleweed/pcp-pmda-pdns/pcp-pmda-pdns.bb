SUMMARY = "Performance Co-Pilot (PCP) metrics for PowerDNS"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the PowerDNS."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-pdns-6.3.8-3.1.noarch.rpm"
RPM_HASH = "6be7618d27ca65bf42894dad3085473863d039c43e08b1a9838fe1cd8124cbfe4e457fd428a47a11eac5a345dd96924a5e4cf58e4c758d14b8091ea2235d6bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
