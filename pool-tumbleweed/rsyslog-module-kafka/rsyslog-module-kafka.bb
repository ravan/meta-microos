SUMMARY = "Kafka support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for Kafka."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-module-kafka-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "70200f684469a3d20f4c6bf13ef0926ebd46fc4b2752932c1e44129cf3d4b67114eeb0be6f82a3c1f14524768dd63ed3a2d54b67d80889956a5f1199cc3fe5ef"

RPROVIDES:${PN} += "rsyslog-module-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
rsyslog"

inherit rpm
