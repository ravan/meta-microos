SUMMARY = "Development files for libddcutil"
DESCRIPTION = "Header files and pkgconfig control file for libddcutil."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "libddcutil-devel-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "2636c02b6ca523ca7666f4d64b87e62b103d67d033f6bce1aaa361f29a1a75592b1d76d9c637a129203b0bf4fff498bb70438dd04fe8aae52cbbc0c596c1f674"

RPROVIDES:${PN} += "libddcutil-devel \
pkgconfig-ddcutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libddcutil5"

inherit rpm
