SUMMARY = "Empty package to ensure rebuilding cpupower in OBS"
DESCRIPTION = "This is empty package that ensures cpupower is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "cpupower-rebuild-7.2.5-14.14.aarch64.rpm"
RPM_HASH = "2ff5c79fd840c25ef31fbcdfada98eb919c2d2508add338fa557eff41c76d6b3fbc9d64ca84f7432725f1f68150e87370e0b44088c27f618e222fe269276c490"

RPROVIDES:${PN} += "cpupower-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
