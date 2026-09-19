SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "perf-rebuild-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "faf918df7c19aeef290bc0efc99e5ea8a42a327aa33a0a3006bc0057c687b4b1de4f06cc9831ba61896f82acfabf7519de41ad5e9dab90eb22e439dbf04e7a3b"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
