SUMMARY = "SSH (Secure Shell) server"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains the Secure Shell daemon, which allows clients to \
securely connect to your server."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-server-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "2c9c142b2f3bbd510ca5bb148240076fd9bdaf35afaca50df2efc4883dfeca57111af227be2d9c6d4633b280de8347da375e00046fd7e8e9cd9cab74450b833e"

RPROVIDES:${PN} += "config-openssh-server \
group-sshd \
openssh-/usr/sbin/sshd \
openssh-server \
user-sshd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
crypto-policies \
fillup \
findutils \
grep \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libfido2.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libpam.so.0 \
libselinux.so.1 \
libsystemd.so.0 \
libwtmpdb.so.0 \
libz.so.1 \
openssh-common \
permissions \
sysuser-shadow"

inherit rpm
