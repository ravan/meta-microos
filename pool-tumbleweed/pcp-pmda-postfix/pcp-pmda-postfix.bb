SUMMARY = "Performance Co-Pilot (PCP) metrics for the Postfix (MTA)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Postfix (MTA)."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-postfix-6.3.8-3.1.noarch.rpm"
RPM_HASH = "e25bf94bad2f951d5c0acb8e505ffbc955c5915e8eb7249fdc001c89e1d7268bfa796371cb0d4e9143d14dfdeeef1f63c2f664eb8a84824e77106ac4a5c0913f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-postfix"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
postfix \
postfix-doc"

inherit rpm
