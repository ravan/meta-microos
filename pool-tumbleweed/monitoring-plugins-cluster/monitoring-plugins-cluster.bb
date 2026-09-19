SUMMARY = "Host/Service Cluster Plugin"
DESCRIPTION = "Provides the check_cluster plugin to check Services and/or Hosts running \
as a cluster. \
 \
Example: \
  check_cluster -s -d 2,0,2,0 -c @3: \
Will alert critical if there are 3 or more service data points in a non-OK \
state."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-cluster-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "6c250ec41bf10a01d04a4162ae43b28db7f6b7adccbc6edd77a1c42f3d6f3294bac14e9c71504a4e41b02d3fc65a9ad8bcf090ef323bbc4e02fbddfb326b5572"

RPROVIDES:${PN} += "monitoring-plugins-cluster \
nagios-plugins-cluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
