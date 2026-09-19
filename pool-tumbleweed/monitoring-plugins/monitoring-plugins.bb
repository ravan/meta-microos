SUMMARY = "The Monitoring Plug-Ins"
DESCRIPTION = "The actual service checks on current monitoring solutions like Icinga, \
Nagios or Shinken (just to name a few) are performed by separate \
'plugin' programs which return the status of the checks to the \
running daemon. \
 \
This package contains those plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "f1a157c38c221a59de61cf3bdd7ac83272a0cd6e8a67ca3e5bc578e703421e0d31ddcb246d9d48762b25c47d551b89cead55ab7e0bdd1a76aeb5f26078aa8536"

RPROVIDES:${PN} += "monitoring-plugins \
nagios-plugins"

RDEPENDS:${PN} += "permissions"

inherit rpm
