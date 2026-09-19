SUMMARY = "Remote access to machines behind firewalls"
DESCRIPTION = "fonehome allows remote access to machines behind firewalls using SSH \
port forwarding. \
 \
The fonehome client is a daemon that runs on remote client machines that \
are behind some firewall that you either do not control or do not want \
to reconfigure, but which does allow normal outgoing TCP connections. The \
clients use SSH to connect to a fonehome server to which you have direct \
access. The SSH connections include reverse-forwarded TCP ports which in \
turn allow you to connect back to the remote machine using the included \
fhssh(1) and fhscp(1) utilities. \
 \
This setup is useful in situations where you have several machines \
deployed in the field and want to maintain access to them from a central \
operations server."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "fonehome-1.2.2-3.8.noarch.rpm"
RPM_HASH = "2d1341186476130f7bcffdc756ad5bd9014b9ba05a9664dc5f69c42b632340d1c376e6751fda37c592e96d268f9422cbb2860015525f2ce8068ebe54fa936bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonehome \
fonehome"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bc \
findutils \
openssh \
sed \
systemd"

inherit rpm
