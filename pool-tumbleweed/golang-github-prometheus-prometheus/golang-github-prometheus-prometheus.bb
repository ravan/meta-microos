SUMMARY = "The Prometheus monitoring system and time series database"
DESCRIPTION = "Prometheus's main features are: \
 - a multi-dimensional data model (time series identified by metric name and key/value pairs) \
 - a flexible query language to leverage this dimensionality \
 - no reliance on distributed storage; single server nodes are autonomous \
 - time series collection happens via a pull model over HTTP \
 - pushing time series is supported via an intermediary gateway \
 - targets are discovered via service discovery or static configuration \
 - multiple modes of graphing and dashboarding support"
LICENSE = "Apache-2.0"

PV = "3.14.0"

RPM_NAME = "golang-github-prometheus-prometheus-3.14.0-1.1.aarch64.rpm"
RPM_HASH = "871aec47c428bae58fef4675b197d05c8b354d9ef140f28c78d6c381317486c787ba27b3d0dcb6711935eecbe1ac78300c37ffa9171954f315b51700ecf7a98e"

RPROVIDES:${PN} += "config-golang-github-prometheus-prometheus \
golang-github-prometheus-prometheus \
prometheus"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-prometheus \
user-prometheus"

inherit rpm
