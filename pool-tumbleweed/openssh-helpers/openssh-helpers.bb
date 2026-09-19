SUMMARY = "OpenSSH AuthorizedKeysCommand helpers"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains helper applications for OpenSSH which retrieve \
keys from various sources."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-helpers-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "ab9d347e98e841ea06664bf1774a17ad7238d637a67a1d4561c7d94d8fd2837bdb99858580f0a4807cfc481132791e9b089bf5a13841ec0a5867b26394ea7dcf"

RPROVIDES:${PN} += "config-openssh-helpers \
openssh-helpers"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openssh-common"

inherit rpm
