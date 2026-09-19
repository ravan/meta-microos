SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.44"

RPM_NAME = "glibc-locale-base-2.44-2.1.aarch64.rpm"
RPM_HASH = "b756bcf4a92952ece45192a67821c11fc7602515ea3700bd32796ad3633fd00a20e591262047a1ae9f97af7e6fdd89a8d8fd9a9f065e379d769fb03b4c8b03da"

RPROVIDES:${PN} += "glibc-locale-base \
locale-glibc-C.utf8 \
locale-glibc-en-US.utf8"

RDEPENDS:${PN} += "glibc"

inherit rpm
