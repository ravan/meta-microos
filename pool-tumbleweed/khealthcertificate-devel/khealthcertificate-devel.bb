SUMMARY = "Development files for khealthcertificate"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to build programs that use the khealthcertificate library."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khealthcertificate-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "aa86bbe57162e3543d221bba68ab9f19f1c7d7c923cb2e113fce6991f3d64b14ec54e7224d35446e28dc986409c871956e16198894147ae8cfe1d71bec9bd200"

RPROVIDES:${PN} += "cmake-KHealthCertificate \
khealthcertificate-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKHealthCertificate1"

inherit rpm
