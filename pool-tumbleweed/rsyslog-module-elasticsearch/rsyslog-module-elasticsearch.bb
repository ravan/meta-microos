SUMMARY = "ElasticSearch output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to an ElasticSearch database."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-elasticsearch-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "b5526377e97cbac30e61cfe9231f17be6b22a61bc8fbb039a201532b8e5c1932fda45c0bcc88cbdfd8113e843ae25d67e2329b2367902bdf50332c6df7ce5423"

RPROVIDES:${PN} += "rsyslog-module-elasticsearch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
rsyslog"

inherit rpm
