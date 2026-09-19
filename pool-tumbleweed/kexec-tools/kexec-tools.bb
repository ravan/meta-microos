SUMMARY = "Tools for loading replacement kernels into memory"
DESCRIPTION = "Kexec is a user space utility for loading another kernel and asking the \
currently running kernel to do something with it. A currently running \
kernel may be asked to start the loaded kernel on reboot, or to start \
the loaded kernel after it panics."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.32+git15.g677dd2f"

RPM_NAME = "kexec-tools-2.0.32+git15.g677dd2f-1.3.aarch64.rpm"
RPM_HASH = "4b30ec4e00ce2b747cd5d1182c025a87ad5f7ab4f2db0258b7f0cf005604cfb4ef1553c7341fd7862b31343dff4a9ccc6d0f4cb1a0589f9ad04c05325d8dc37f"

RPROVIDES:${PN} += "kexec-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl-Bootloader \
suse-module-tools \
systemd"

inherit rpm
