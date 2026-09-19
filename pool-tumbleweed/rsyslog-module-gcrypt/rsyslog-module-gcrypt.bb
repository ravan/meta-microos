SUMMARY = "Libgcrypt log file encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log file encryption support using libgcrypt and \
a rsgtutil utility to manage the files."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-gcrypt-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "f071deaf7d8e2341311f383f5691475b01a81381f3b4e921968c21fb2d87b6fd132e7ef8bdcf536b009b7c93e12740712f864d0722f183811ddaf87a2c5f64e1"

RPROVIDES:${PN} += "rsyslog-module-gcrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
rsyslog"

inherit rpm
