SUMMARY = "SSH brute force attack protector"
DESCRIPTION = "Sshguard protects networked hosts from brute force attacks \
against ssh servers. It detects such attacks and blocks the \
attacker's address with a firewall rule."
LICENSE = "ISC"

PV = "2.5.1"

RPM_NAME = "sshguard-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "7b29a9fda89b8cadd378836fde861daac4fe31ebb599aee3474cca6fbb210a23c1a95adec98d7c843d9fce3610f90eed333483f1a29f7e319a4e4605a6887f91"

RPROVIDES:${PN} += "config-sshguard \
sshguard"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
openssh \
systemd"

inherit rpm
