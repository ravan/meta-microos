SUMMARY = "Check RPC service"
DESCRIPTION = "Check if a rpc service is registered and running using rpcinfo."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-rpc-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "45b786aa5186e449292c14884c1840d76f3badc3fbe11be9f5364830909907586163ab5b4d145df7071124b1f347b5fc74a793197b71f15e0ab1cd0347c25fe7"

RPROVIDES:${PN} += "monitoring-plugins-rpc \
nagios-plugins-rpc"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
rpcbind"

inherit rpm
