SUMMARY = "Helper program for using a pipe for SSH authentication"
DESCRIPTION = "fd0ssh a helper program used by non-interactive programs, for example \
pam_mount, that want to pipe a password to ssh. It works similar in \
spirit to expect(1), but implements much less features."
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "fd0ssh-20251011-1.6.aarch64.rpm"
RPM_HASH = "c96f82142881216b217eeb2324a46bcd46939c236b6e24d5dd22c966437e7bd0b50b7df1ce2d5038917503651bd4677d37fc21615832d2853eb9172a6a31263f"

RPROVIDES:${PN} += "fd0ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
