SUMMARY = "Diagnostic tools"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional diagnostic tools (small helpers, \
usually not needed)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-diag-tools-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "cf5d8cd608b6c2343e3f5622c79a763c3844f8e7f64e13895631e1c4a6685b6764a5c19e853366282f9a1d92a25ac7bafbd0b225769bf9bc8cd2b23222cc80fa"

RPROVIDES:${PN} += "rsyslog-diag-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
rsyslog"

inherit rpm
