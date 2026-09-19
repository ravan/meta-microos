SUMMARY = "HDFS via HTTP output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to HDFS via HTTP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-omhttpfs-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "2d7d45f33c1e56d88bc30ec836bbb0f8400ed850571ccf623425d3167aea5c6c76efcf8f9e76033262f0ff2bb1cc8e3596cab42fe0949d8f58ec7109d376d3b3"

RPROVIDES:${PN} += "rsyslog-module-omhttpfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfastjson.so.4 \
rsyslog"

inherit rpm
