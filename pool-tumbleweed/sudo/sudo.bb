SUMMARY = "Execute some commands as root"
DESCRIPTION = "Sudo is a command that allows users to execute some commands as root. \
 \
Sudo reads either /etc/sudoers or /usr/etc/sudoers \
(in that order, whichever one it finds first), to determine what users have \
 \
 \
 \
access to sudo and which commands they can run. Sudo logs all its \
activities to syslogd, so the system administrator can keep an eye on \
things. Sudo asks for the password to initialize a check period of a \
given time N (where N is defined at installation and is set to 5 \
minutes by default). Administrators can edit the sudoers file with 'visudo'."
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "sudo-1.9.17p2-4.1.aarch64.rpm"
RPM_HASH = "4d71eff0c83f3946c25b878005dc7a0710c7ff8714e9ddcfd4b46a1d156caf14445bf9092732a0378746a4aaea2dd8583ed5d8a61593c3bc41bd8f1886a03a6c"

RPROVIDES:${PN} += "config-sudo \
libsudo-util.so.0 \
sudo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
libselinux.so.1 \
libssl.so.3 \
libz.so.1 \
permissions"

inherit rpm
