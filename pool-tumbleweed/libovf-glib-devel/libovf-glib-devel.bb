SUMMARY = "Development Files for gtk-frdp, a virtual machine image library"
DESCRIPTION = "Libgovf is a library for reading and writing virtual machine images \
in the Open Virtualization Format. \
 \
This package provides all the necessary files for development with \
libovf-glib."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "libovf-glib-devel-50.0-2.2.aarch64.rpm"
RPM_HASH = "29d8508764b7cbaa26adf802957bfaacb5c09164573f71344f4144631d3b10d134bfe5ed2aa8611186aa4425cc805c023f58d07508342147e966872ed8f5e74c"

RPROVIDES:${PN} += "libovf-glib-devel"

RDEPENDS:${PN} += "gnome-boxes"

inherit rpm
