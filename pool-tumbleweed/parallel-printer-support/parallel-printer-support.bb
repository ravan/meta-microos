SUMMARY = "Parallel Printer Support"
DESCRIPTION = "This package creates static udev nodes for the parallel ports.  The \
purpose is to load the 'lp' kernel module automatically the first time \
data is sent to the parallel port. \
 \
Since the lp kernel module can't autodetect devices, this is the only \
way to load the parallel printer modules without manual intervention."
LICENSE = "BSD-2-Clause"

PV = "1.00"

RPM_NAME = "parallel-printer-support-1.00-15.6.noarch.rpm"
RPM_HASH = "84820350e641f1d8035298ca91f2cffb3eb7fc6936c087b8b0332e15070cbd6bdec316e2f615bcb730ea426c55d044073cc715cb6e4fb75dde4d870b514d21f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parallel-printer-support"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
group-lp \
systemd \
udev"

inherit rpm
