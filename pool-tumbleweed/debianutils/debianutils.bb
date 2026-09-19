SUMMARY = "Miscellaneous utilities specific to Debian"
DESCRIPTION = "* add-shell: add a shell to /etc/shells \
* ischroot: etects if it is currently running in a chroot \
* run-parts: run scripts or programs in a directory \
* remove-shell: remove a shell to /etc/shells \
* update-shells: update the list of valid login shells"
LICENSE = "GPL-2.0-only"

PV = "5.4"

RPM_NAME = "debianutils-5.4-2.11.aarch64.rpm"
RPM_HASH = "119dbaf074f4d17a0228458968ef5296e60417bb4e9ac95e4238ca0208a9746df2c28046e372018005c119f9123ceb905bd650dce05e044400586a92cd289235"

RPROVIDES:${PN} += "debianutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
