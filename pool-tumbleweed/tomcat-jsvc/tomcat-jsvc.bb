SUMMARY = "Apache jsvc wrapper for Apache Tomcat as separate service"
DESCRIPTION = "Systemd service and wrapper scripts to start tomcat with jsvc, \
which allows tomcat to perform some privileged operations \
(e.g. bind to a port < 1024) and then switch identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-jsvc-9.0.121-1.1.noarch.rpm"
RPM_HASH = "602497c6dee24448f6702b7e9efafd77bc193a76995ad9489bafbed0db2cc358717a2f54a025a468d408ede836f6646a8947fa0e00f05819f97717bd747b5a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-jsvc \
tomcat-jsvc"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-daemon-jsvc \
tomcat"

inherit rpm
