SUMMARY = "Secure Shell Client and Server (Remote Login Program)"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into and executing commands \
on a remote machine. It replaces rsh (rlogin and rsh) and \
provides secure encrypted communication between two untrusted \
hosts over an insecure network. \
 \
xorg-x11 (X Window System) connections and arbitrary TCP/IP ports can \
also be forwarded over the secure channel. \
 \
This is a dummy package that pulls in both the client and server \
components."
LICENSE = "BSD-2-Clause & MIT"

PV = "10.5p1"

RPM_NAME = "openssh-10.5p1-1.2.aarch64.rpm"
RPM_HASH = "4aee43b8281623cb9f313781111d0a823b298797e0c9f214c109f16ab1c475ff6407479d6ef3f93cde1764c95b063bbc53bc42baba009c8886113aa3068b1b19"

RPROVIDES:${PN} += "openssh"

RDEPENDS:${PN} += "findutils \
grep \
openssh-clients \
openssh-server"

inherit rpm
