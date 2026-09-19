SUMMARY = "Performance Co-Pilot (PCP) metrics for Netfilter framework"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Netfilter packet filtering framework."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-netfilter-6.3.8-3.1.noarch.rpm"
RPM_HASH = "265c7f8460f35cea6b89fe36785fd11eb13066be5dd770a74f5367f0b99234fadc3c4dca6a9427a6267c1d83e01bcbfe2448d3c42f2c8e6eb59698f9ec7fe365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-netfilter"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
