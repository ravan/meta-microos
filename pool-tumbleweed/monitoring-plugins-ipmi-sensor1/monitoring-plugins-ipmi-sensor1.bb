SUMMARY = "IPMI Sensor 1 Monitoring Plugin"
DESCRIPTION = "This plugin checks all IPMI sensors of a server remotely or locally. It works \
with any IPMI-compatible server, so you can use it also in heterogeneous \
environments with different server vendors. \
 \
This version 1.x is based on ipmitool and can only monitor threshold based \
sensors."
LICENSE = "GPL-3.0+"

PV = "1.3"

RPM_NAME = "monitoring-plugins-ipmi-sensor1-1.3-105.7.noarch.rpm"
RPM_HASH = "c4099371438d1092382a67345649beb70776609614269fedde1a7a5a29df4c014fb6d238ef28c36fb6cf998d85d5ab15ad279bd0c6fe17499306b870a23e48ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-ipmi-sensor1 \
monitoring-plugins-ipmi-sensor1 \
nagios-plugins-ipmi-sensor1"

RDEPENDS:${PN} += "/usr/bin/bash \
ipmitool"

inherit rpm
