SUMMARY = "Header files and libraries for developing apps which will use CrackLib"
DESCRIPTION = "The cracklib-devel package contains the header files and libraries \
needed to develop programs that use the CrackLib functions to to \
determine whether passwords match certain security-oriented \
characteristics."
LICENSE = "LGPL-2.1-only"

PV = "2.9.11"

RPM_NAME = "cracklib-devel-2.9.11-1.11.aarch64.rpm"
RPM_HASH = "9869d23e833397e96a1f1426f64a961b9402fa85507ec10e1d34603122002d4d6a45aabe9f508e41fa8787eec234ec119dfbd3818b0d326323e5dfb5f66acd12"

RPROVIDES:${PN} += "cracklib-/usr/include/crack.h \
cracklib-devel"

RDEPENDS:${PN} += "glibc-devel \
libcrack2"

inherit rpm
