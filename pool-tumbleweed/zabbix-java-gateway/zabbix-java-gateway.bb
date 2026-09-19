SUMMARY = "Zabbix Java gateway"
DESCRIPTION = "JMX monitoring can be used to monitor JMX counters of a Java \
application. To retrieve the value of a particular JMX counter on a \
host, the Zabbix server queries the Zabbix Java gateway, which in \
turn uses the JMX management API to query the application of interest \
remotely."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-java-gateway-7.0.28-1.2.noarch.rpm"
RPM_HASH = "368ab4691ccc2820d73184262ba88330e3b9cc50adc87264b41be7c36a7846299d0ded733eaf8237b6d1d9d6261c094b08ccca23234ccbe621017fb946522982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-zabbix-java-gateway \
zabbix \
zabbix-java-gateway"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
group-zabbixs \
jre \
shadow \
user-zabbixs"

inherit rpm
