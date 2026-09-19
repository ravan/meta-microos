SUMMARY = "Additional documentation for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional documentation for rsyslog."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-doc-8.2608.0-1.1.noarch.rpm"
RPM_HASH = "913209961835f39019265b24e404e05076329246b0575f1a79954bfd3a064b822db5002b4a305a8162ffb6e617eb1e08f14deeba71c1c003a50882bd345ff3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rsyslog-doc"

RDEPENDS:${PN} += ""

inherit rpm
