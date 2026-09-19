SUMMARY = "Dummy check"
DESCRIPTION = "This plugin will simply return the state corresponding to the numeric value of \
the <state> argument with optional text."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dummy-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "d84a6c176b42dd522198160dc5de5494cd9acd681dc181f7c499edddde8aea69988df90b3a18b4cefd19ccbf56bae6985db1528ebbd939c191eb86022bc55df9"

RPROVIDES:${PN} += "monitoring-plugins-dummy \
nagios-plugins-dummy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
