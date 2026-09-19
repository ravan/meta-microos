SUMMARY = "Security and System auditing tool"
DESCRIPTION = "Lynis is a security and system auditing tool. It scans a system on the \
most interesting parts useful for audits, like: \
     - Security enhancements \
     - Logging and auditing options \
     - Banner identification \
     - Software availability"
LICENSE = "GPL-3.0-only"

PV = "3.1.7"

RPM_NAME = "lynis-3.1.7-1.2.noarch.rpm"
RPM_HASH = "00df6caaada7853ad0f12cdbc0a942389d5b4d6b8f2201950e38c9ff52a0d4f06b88cc37e4516d66f9f5cb092ed4d100b07c883c8618f0caab3415370075b441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lynis \
lynis"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bash \
cron \
fillup \
findutils \
gawk \
libnss-usrfiles2 \
logrotate \
net-tools-deprecated \
netcfg \
wget"

inherit rpm
