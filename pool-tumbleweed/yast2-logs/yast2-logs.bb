SUMMARY = "Scripts for handling YAST logs"
DESCRIPTION = "This package contains scripts for handling YAST logs."
LICENSE = "GPL-2.0-only"

PV = "5.0.21"

RPM_NAME = "yast2-logs-5.0.21-1.2.aarch64.rpm"
RPM_HASH = "b08f07cf1df50ad8a464d0826f996878fb3645191ee5c59c7b973a895d20b786775d392e105a343df5793ab199ea499199147538851458ac6c9372cf24f8a011"

RPROVIDES:${PN} += "yast2-/usr/sbin/save-y2logs \
yast2-logs"

RDEPENDS:${PN} += "/usr/bin/bash \
tar"

inherit rpm
