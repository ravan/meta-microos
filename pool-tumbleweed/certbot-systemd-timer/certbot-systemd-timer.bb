SUMMARY = "systemd timer unit to renew certbot certificates"
DESCRIPTION = "Optional systemd timer, which takes care of certbot certificate renewals."
LICENSE = "Apache-2.0"

PV = "0.0"

RPM_NAME = "certbot-systemd-timer-0.0-5.2.noarch.rpm"
RPM_HASH = "2c903016cebf722d5dc44eeaa9b95bdaa0068a11bed9809311b1b14b114a34d9f723a60fe8c5c8167e538af8c2af09e705cbf7da856b50466dc48a6d2db03b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "certbot-systemd-timer"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
certbot \
fillup \
systemd"

inherit rpm
