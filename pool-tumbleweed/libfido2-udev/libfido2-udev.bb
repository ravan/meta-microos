SUMMARY = "Udev rules for libfido2"
DESCRIPTION = "This package contains the udev rules for FIDO2 compatible devices."
LICENSE = "BSD-2-Clause"

PV = "1.16.0"

RPM_NAME = "libfido2-udev-1.16.0-2.1.noarch.rpm"
RPM_HASH = "f141c57a05dc259e30e2583b6d233e9e3f65d608b7124d9caa55b61be84093fdbc9cda033bfaab4790e9a6bbda1d067072659d488b823f99664121585663fb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfido2-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
