SUMMARY = "SSH (Secure Shell) client applications"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains clients for making secure connections to Secure \
Shell servers."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-clients-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "d736f5a1b086cef192d96bd139c9395f3e4ae54d73d6628e73fd2a852c12931828d1096ad741f90a949afb4aa8df3060ade8903bcd89730c64b55dfdcec8edc8"

RPROVIDES:${PN} += "openssh-/usr/bin/ssh \
openssh-clients"

RDEPENDS:${PN} += "/usr/bin/sh \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libedit.so.0 \
libfido2.so.1 \
libgssapi-krb5.so.2 \
libselinux.so.1 \
libz.so.1 \
openssh-common"

inherit rpm
