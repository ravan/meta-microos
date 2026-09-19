SUMMARY = "All Monitoring Plugins for collectd"
DESCRIPTION = "Metapackage that installs collectd and all the available \
monitoring plugin subpackages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugins-all-5.12.0.382.g2cd055fe-3.1.noarch.rpm"
RPM_HASH = "f0d3d1e65ad40355d263e39823c7a2ae4f5876ecac75a145d304c94d287eaa1317a4e498a3b0ff44ab8a5d99143d0d7cd8dbc366beaee716268813e1a6bd0314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-plugins-all"

RDEPENDS:${PN} += "collectd \
collectd-plugin-amqp \
collectd-plugin-buddyinfo \
collectd-plugin-connectivity \
collectd-plugin-dbi \
collectd-plugin-gps \
collectd-plugin-ipmi \
collectd-plugin-java \
collectd-plugin-logparser \
collectd-plugin-lua \
collectd-plugin-mcelog \
collectd-plugin-memcachec \
collectd-plugin-modbus \
collectd-plugin-mqtt \
collectd-plugin-mysql \
collectd-plugin-notify-desktop \
collectd-plugin-nut \
collectd-plugin-openldap \
collectd-plugin-ovs \
collectd-plugin-pcie \
collectd-plugin-pinba \
collectd-plugin-postgresql \
collectd-plugin-procevent \
collectd-plugin-python3 \
collectd-plugin-sigrok \
collectd-plugin-smart \
collectd-plugin-snmp \
collectd-plugin-synproxy \
collectd-plugin-sysevent \
collectd-plugin-ubi \
collectd-plugin-uptime \
collectd-plugin-virt \
collectd-plugin-write-influxdb-udp \
collectd-plugin-write-stackdriver \
collectd-plugin-write-syslog \
collectd-web \
collectd-web-js"

inherit rpm
