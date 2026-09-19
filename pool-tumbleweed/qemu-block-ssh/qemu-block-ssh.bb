SUMMARY = "SSH (SFTP) block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
SSH network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-block-ssh-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "4a1a9e56bfb5f32d83f8cd97a640949268571a7cd99ff5064e9cbb864ed59fe9cb36809eb33e1c1c9695eea506aaac3704860764a013aa983a25cd44a1169f91"

RPROVIDES:${PN} += "qemu-block-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
