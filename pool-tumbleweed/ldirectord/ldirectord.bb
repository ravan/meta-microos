SUMMARY = "A Monitoring Daemon for Maintaining High Availability Resources"
DESCRIPTION = "The Linux Director Daemon (ldirectord) was written by Jacob Rief. \
<jacob.rief@tiscover.com> \
 \
ldirectord is a stand alone daemon for monitoring the services on real \
servers. Currently, HTTP, HTTPS, and FTP services are supported. \
ldirectord is simple to install and works with Pacemaker \
(http://clusterlabs.org/). \
 \
See 'ldirectord -h' and linux-ha/doc/ldirectord for more information."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "4.18.0+git94.6c50a9b"

RPM_NAME = "ldirectord-4.18.0+git94.6c50a9b-1.1.aarch64.rpm"
RPM_HASH = "dc50448e819dc4f66106f79d45c014c48b0eb08d1fa3a4f657a0e8b4322010a80d2d68216e991bc5bb291c470dbcaff5cc3d7c80df76bda88ca4531feed3838a"

RPROVIDES:${PN} += "config-ldirectord \
heartbeat-ldirectord \
ldirectord"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ipvsadm \
logrotate \
perl-IO--Socket--IP \
perl-LWP \
perl-MailTools \
perl-Net--SSLeay \
perl-Socket6 \
resource-agents \
systemd"

inherit rpm
