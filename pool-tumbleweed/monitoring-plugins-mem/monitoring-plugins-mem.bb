SUMMARY = "Check memory plugin for Nagios"
DESCRIPTION = "We have always monitored RAM usage on all of boxes. Sure, there's the argument \
that unused RAM is money wasted, but I always like to know not just when the \
box is swapping, but when it's about to start swapping. There have been a few \
plugins over the years that I've used for this - check_ram for Solaris, \
check_mem for Linux, and there's also check_mem.pl."
LICENSE = "MIT"

PV = "20120618"

RPM_NAME = "monitoring-plugins-mem-20120618-103.7.noarch.rpm"
RPM_HASH = "3d7f32dc625378bc6326399f7fa4b10e7cb89267408e39fdccfe209254b9c79f350acb229f1a1e3885c1b7858a335ff24e73444438f005799d96da2976761b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-mem \
monitoring-plugins-mem \
nagios-plugins-mem"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
