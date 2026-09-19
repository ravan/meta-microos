SUMMARY = "Syslog service files & scripts"
DESCRIPTION = "The package syslog-service provides the service boot \
scripts for SysV and the service unit files for systemd."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "syslog-service-2.0-808.4.noarch.rpm"
RPM_HASH = "eeb26075756bee83c82c644067cb9c04cb7c53e384c11f9a42cd9c719dfc9997635c84b48458bbfdb7ac661b7c5223a2bcb0de3482d92383977b884b8a77a84b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syslog-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
logrotate \
syslog"

inherit rpm
