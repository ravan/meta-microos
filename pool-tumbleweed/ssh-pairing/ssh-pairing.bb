SUMMARY = "Passwordless SSH key exchange through pairing"
DESCRIPTION = "This tool allows to use pairing (like bluetooth, kde connect, ...) for exchanging public SSH keys, basically as alternative to ssh-copy-id. \
With this, setting up SSH authentication is more user friendly, as the user's public key does not need to be transferred to the server manually. \
It is arguably also more secure, as no passwords are involved, not even temporarily just to be able to ssh-copy-id. \
This tool is design to be used as part of some CLI or TUI, but can also be used manually."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "ssh-pairing-0.4-1.3.aarch64.rpm"
RPM_HASH = "56bfcf106485e863bd5560fba7bbce513775abc307e11ac7fa3517e5cc23c1edc2c573c00609d6ecad4d674c1ad2cc51efd9a7e787a9ae2f81fccb81665e2109"

RPROVIDES:${PN} += "ssh-pairing"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/ssh-keygen \
dialog \
hostname \
ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
