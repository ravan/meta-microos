SUMMARY = "Performance Co-Pilot (PCP) Zeroconf Package"
DESCRIPTION = "This package contains configuration tweaks and files to increase metrics \
gathering frequency, several extended pmlogger configurations, as well as \
automated pmie diagnosis, alerting and self-healing for the localhost. \
A timer script also writes daily performance summary reports similar to \
those written by sysstat."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-zeroconf-6.3.8-3.1.noarch.rpm"
RPM_HASH = "b1081147a5aa762400f69f8d0929ba43b2a088f772cca07c1ee4f31b5b02373fde5b4f065cd9adf97fbf55e95fddf2e062eba5d6caa1ef29383aa0357914e4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-zeroconf \
pcp-zeroconf"

RDEPENDS:${PN} += "/usr/bin/sh \
pcp \
pcp-doc \
pcp-pmda-dm \
pcp-pmda-nfsclient \
pcp-system-tools"

inherit rpm
