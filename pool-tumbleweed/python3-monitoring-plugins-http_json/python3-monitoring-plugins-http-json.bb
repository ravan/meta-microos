SUMMARY = "Plugin for Nagios which checks json values from a given HTTP endpoint"
DESCRIPTION = "A generic plugin for Icinga/Nagios which checks json values from a given \
HTTP endpoint against argument specified rules and determines the \
status and performance data for that service."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python3-monitoring-plugins-http_json-2.4.0-1.2.noarch.rpm"
RPM_HASH = "95f9f8ea378ca49843e546acaea4471b667d92fa1f870c504ad8dad842169a98c815e534e9f8ea375ee4f0aac30fc9852e16b7a1008156ce10e3c0f090b2e8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-monitoring-plugins-http-json"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
