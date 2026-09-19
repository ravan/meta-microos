SUMMARY = "Apache jsvc wrapper for Apache Tomcat as separate service"
DESCRIPTION = "Systemd service and wrapper scripts to start tomcat with jsvc, \
which allows tomcat to perform some privileged operations \
(e.g. bind to a port < 1024) and then switch identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-jsvc-11.0.25-1.1.noarch.rpm"
RPM_HASH = "a626fc63d59d1e038a3bd197a355fd7776c91982884b68ca5bf31443ecab046a0db5038a837e8d7bce3de2634c587c7301d271703b25dc012cf7238c9f07a3c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-jsvc \
tomcat11-jsvc"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-daemon-jsvc \
tomcat11"

inherit rpm
