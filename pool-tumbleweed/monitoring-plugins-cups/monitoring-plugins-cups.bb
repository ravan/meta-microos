SUMMARY = "Check cups service"
DESCRIPTION = "Check the status of a remote CUPS server, all printers there \
or one selected. It can also check queue there: \
it will provide the size of the queue of age of queue."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-cups-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "b9b9903797673a9843ff6c242be8bca2cccbb853772ddbba6179a9db6d027bc99f03fff8b3acff1550e8e934674465c9e8da0dcc80edebc736aabed2c1caa55e"

RPROVIDES:${PN} += "config-monitoring-plugins-cups \
monitoring-plugins-cups \
nagios-plugins-cups"

RDEPENDS:${PN} += "/usr/bin/bash \
cups-client"

inherit rpm
