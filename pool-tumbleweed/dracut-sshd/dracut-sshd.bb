SUMMARY = "Provide SSH access to initramfs early user space"
DESCRIPTION = "This Dracut module integrates the OpenSSH sshd into your \
initramfs. It allows for remote unlocking of a fully encrypted \
root filesystem and remote access to the Dracut emergency shell \
(i.e. early userspace)."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "dracut-sshd-0.7.0-1.4.noarch.rpm"
RPM_HASH = "239c671b77a7f344c5cfc2d1d43ffb7505856d8a9c1183f1f0dfa56cd6e21d1c071d42701c899c62b9326d842d70e66b16dbf1b21ca07a30aad8951e2fee83a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-sshd"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut"

inherit rpm
