SUMMARY = "Security-Check Scripts"
DESCRIPTION = "Regularly executable scripts (via systemd timers) for checking the security of \
your system. The seccheck systemd timers have to be enabled (and possibly started) \
by the administrator for the checks to be run."
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "seccheck-3.0-18.17.noarch.rpm"
RPM_HASH = "6d39a28a19335cc64f69f15133bbb2e73b3b31bcc086172a35676de1193b15829540894a3c186613f14847a569fa2708680827183c18e754ec9f15dbede8a859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-seccheck \
seccheck \
suse-security-check-3.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bash \
fillup \
systemd"

inherit rpm
