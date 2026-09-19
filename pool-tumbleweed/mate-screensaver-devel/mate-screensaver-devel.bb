SUMMARY = "Development files for mate-screensaver"
DESCRIPTION = "mate-screensaver is a screen saver and locker that integrates with \
the MATE desktop. \
 \
This subpackage contains the pkgconfig file."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-screensaver-devel-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "cd017d03e6064ffe44876ffe07943d492216738ae00aca758707174a63989c131bfc2b0e5b152ad758c959dfaf5ed584a18f2114fda59d47d5233c54cced5709"

RPROVIDES:${PN} += "mate-screensaver-devel \
pkgconfig-mate-screensaver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mate-screensaver"

inherit rpm
