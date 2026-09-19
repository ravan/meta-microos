SUMMARY = "Check keepalived"
DESCRIPTION = "This script either uses the 'notify' or snmp functionality of keepalived \
to inform an administrator about the current state of keepalived masters and \
slaves. \
 \
While the SNMP part is simply querying a SNMP server for the keepalived \
part (via agentx), the 'notify' part needs some adaptions in the keepalived.conf \
to: \
* execute a script on changes during keepalived runtime, which writes \
  the state change into a temporary file \
* read the file each time the monitoring server asks for the state if \
  there is a keepalived up and running"
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "monitoring-plugins-keepalived-0.1.5-2.1.noarch.rpm"
RPM_HASH = "3db925a0765e142019424ed2d1edc54f1cdae519473ce75e45891414a3213622bc2f36a515c384d5ba14a09e16738162a3aa69593949f0bef01d334ad1858576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-keepalived \
monitoring-plugins-keepalived"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
bash \
coreutils \
grep \
keepalived \
logrotate \
monitoring-plugins-common \
procps"

inherit rpm
