SUMMARY = "Send a mail if a systemd.timer fails and/or succeeds"
DESCRIPTION = "systemd-mail-status is called by systemd-status-mail@.service if the \
service is configured for the OnFailure and/or OnSuccess case of a \
systemd unit. It sends an email to a configureable address with the name \
of the service, the hostname and the output of \
'systemctl status --full <service>'."
LICENSE = "GPL-2.0-or-later"

PV = "1.21+git.20260212"

RPM_NAME = "systemd-status-mail-1.21+git.20260212-1.2.noarch.rpm"
RPM_HASH = "ac6c2b0da912a07bd9474905669c6b5f0f45b72f8d77ed987f9706ec3d6cc89fc198b1b0714690424da39d0e04baad039217622d89c8f78b43e73a6e0c1d1fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-systemd-status-mail \
systemd-status-mail \
user-systemd-status-mail"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
