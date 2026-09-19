SUMMARY = "Get performance data from sar"
DESCRIPTION = "This plug-in was written to get performance data from sar. It was developed for \
use with Zenoss but should work with other NRPE compatible NMS. \
 \
Example output: \
 \
check_sar_perf cpu \
sar OK| CPU=all user=59.90 nice=0.00 system=4.46 iowait=0.00 steal=0.00 \
  idle=35.64 \
 \
check_sar_perf disk sda \
sar OK| DEV=sda tps=0.00 rd_sec/s=0.00 wr_sec/s=0.00 avgrq-sz=0.00 \
  avgqu-sz=0.00 await=0.00 svctm=0.00 util=0.00"
LICENSE = "BSD-2-Clause"

PV = "0.1+git.1272298931.4878d0c"

RPM_NAME = "monitoring-plugins-sar-perf-0.1+git.1272298931.4878d0c-2.6.noarch.rpm"
RPM_HASH = "f25ba60ed9dc365809dc3f982cc735310f908a67b152ba0469d8a0cadc62865192a6644f690e98831b99804be77c26d79ce2da6026cf2b01573a0a7b0d304159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-sar-perf \
monitoring-plugins-sar-perf \
nagios-plugins-sar-perf"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
python3 \
sysstat"

inherit rpm
