SUMMARY = "Input device event monitor and query tool"
DESCRIPTION = "evtest displays information on the input device specified on the command line, \
including all the events supported by the device. It then monitors the device \
and displays all the events layer events generated."
LICENSE = "GPL-2.0-or-later"

PV = "1.36"

RPM_NAME = "evtest-1.36-1.4.aarch64.rpm"
RPM_HASH = "aedc927fd1236f86a555107f067c54f7f9c4248e3bbc500faae93db40e6db8409ab81a9249f44d2b01a95eda98143285db16ebf7db891535bfae2a3ba2f5ed19"

RPROVIDES:${PN} += "evtest \
input-utils-/usr/bin/evtest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
