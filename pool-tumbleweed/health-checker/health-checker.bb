SUMMARY = "Service for verifying that important services are running"
DESCRIPTION = "health-checker is a service running once at every reboot to verify \
that all important services are running. If it is the first reboot after \
an update, an automatic rollback to the last working snapshot is made. \
If this is not after an update, a reboot is made. If this does not help, \
the services will be disabled. \
This package does not contain any checks. For this, additional \
plugins for different products are needed."
LICENSE = "GPL-2.0-only"

PV = "1.13+git20260414.bb3e4ad"

RPM_NAME = "health-checker-1.13+git20260414.bb3e4ad-1.2.noarch.rpm"
RPM_HASH = "a914cbca199f324eb38dd14a3c2e65ab6885b0a67eac8dac56ecf8252c9da179aa2b293d923931bd1812433a3fa0064fe7b21e9b84922a2d978c0d10b6321025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-health-checker \
health-checker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
health-checker-plugins"

inherit rpm
