SUMMARY = "Apache jsvc wrapper for Apache Tomcat as separate service"
DESCRIPTION = "Systemd service and wrapper scripts to start tomcat with jsvc, \
which allows tomcat to perform some privileged operations \
(e.g. bind to a port < 1024) and then switch identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-jsvc-10.1.59-1.1.noarch.rpm"
RPM_HASH = "e6be3de7e33ab2d5de9fd29117b204bdfe036ec2829a6b687c51b84ebf98c052518da0f348f493502d29dae00878398a58a869c3a9016232747459768051b82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-jsvc \
tomcat10-jsvc"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-daemon-jsvc \
tomcat10"

inherit rpm
