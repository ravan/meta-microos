SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nginx Webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Nginx Webserver."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-nginx-6.3.8-3.1.noarch.rpm"
RPM_HASH = "1a21fc51917130011d989f74485f379dc5eb7cb8cf4df74b44ed0cfd2113774d65b4e550d7cf39ef5b5bb3b59eb593d5c21772c3748df302234fbb94069ff804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-nginx \
pcp-pmda-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-LWP--UserAgent \
perl-PCP-PMDA"

inherit rpm
