SUMMARY = "Performance Co-Pilot (PCP) metrics for Rsyslog"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Rsyslog."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-rsyslog-6.3.8-3.1.noarch.rpm"
RPM_HASH = "4af909ea5f89035714c90f7386557c158bcc27cb641975a4cfe1e5788cbe787c39fd650b20d6006ef4a0e9f3ab513820398bf975e55dd47c9c70d3e506ce28fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-rsyslog"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
