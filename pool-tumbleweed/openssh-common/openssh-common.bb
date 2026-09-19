SUMMARY = "SSH (Secure Shell) common files"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This package contains common files for the Secure Shell server and \
clients."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-common-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "43d9db02b1968fd9898ec3a7c62ad06a1d696d91163b540657a2d5d1653e34f9448e2d0ca7797169ef81519283b87b43ce59d1f25628bbdd789c7873521e8d88"

RPROVIDES:${PN} += "openssh-common \
openssh-fips"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libselinux.so.1"

inherit rpm
