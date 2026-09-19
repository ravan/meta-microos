SUMMARY = "A GNOME-Based Passphrase Dialog for OpenSSH"
DESCRIPTION = "SSH (Secure Shell) is a program for logging into a remote machine and \
for executing commands on a remote machine. This package contains a \
GNOME-based passphrase dialog for OpenSSH."
LICENSE = "BSD-2-Clause"

PV = "10.5p1"

RPM_NAME = "openssh-askpass-gnome-10.5p1-1.1.aarch64.rpm"
RPM_HASH = "b34c831cda7880026093ed3c2d5da6a61ee018994892d3470dbdc0e6e2910a02cc103c5dfd7e2940a1cef0a0ffa7f9959069bf0261321ebd8b069baab9c4f035"

RPROVIDES:${PN} += "openssh-askpass-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
openssh-clients"

inherit rpm
