SUMMARY = "Performance Co-Pilot (PCP) metrics for simple network checks"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from simple network checks."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-netcheck-6.3.8-3.1.noarch.rpm"
RPM_HASH = "8f130f4517e8f55f1e2e2316a6a4b5e860b81b2dd172af1672f7e25d5761bb0788f61d737520d8ecc5e41bf7eea37e5cc07dcf7b80b7b096f0113cbe9a71a51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-netcheck \
pcp-pmda-netcheck"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
