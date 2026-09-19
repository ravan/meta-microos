SUMMARY = "A collection of various tools using ssh"
DESCRIPTION = "A collection of various tools using ssh \
The following tools are included \
  * ssh-ping: check if host is reachable using ssh_config \
  * ssh-last: like 'last' but for SSH sessions \
  * ssh-certinfo: shows validity and information of SSH certificates \
  * ssh-force-password: enforces password authentication \
  * ssh-keyinfo: prints keys in several formats \
  * ssh-hostkeys: prints server host keys in several formats \
  * ssh-facts: get some facts about the remote system \
  * ssh-diff: diff a file over SSH \
  * ssh-version: shows version of the SSH server you are connecting to \
  * ssh-pwd: quickly echo path to use for scp, rsync \
  * ssh-authorized-keys: collects info from authorized_keys files from every user it can find \
  * ssh-sig: make 'ssh-keygen -Y' easier to use"
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "ssh-tools-1.9-1.2.aarch64.rpm"
RPM_HASH = "905378a2a985e6a891ed4aff2093091a0ff981866a32cb6cd20becb03ceb9ef30eb5e29df2b4143276736d7edfe20df3f82f6111e6edebf1e64b12fbd5ec41cd"

RPROVIDES:${PN} += "ssh-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
bash \
libc.so.6 \
openssh \
perl"

inherit rpm
