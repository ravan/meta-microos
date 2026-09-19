SUMMARY = "Development package for kio_audiocd"
DESCRIPTION = "This package contains the development files for the audiocd kio slave"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kio_audiocd-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ad3cea7b0d5e3eaa16ac2afc21b71b875ae029003e690cbda59051382d8c4edbbe56e6186107aa6f18f734715dcc13da123e0600e13e8eb5a846e38f6ddef4b3"

RPROVIDES:${PN} += "kio-audiocd-devel"

RDEPENDS:${PN} += "kio-audiocd"

inherit rpm
