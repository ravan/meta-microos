SUMMARY = "IBM Plex Sans Arabic"
DESCRIPTION = " \
IBM Plex is a typeface superfamily to reflect the design principles \
of IBM and to be used for all brand material across the company \
internationally. \
 \
This package provides IBM Plex Sans Arabic."
LICENSE = "OFL-1.1"

PV = "6.4.0"

RPM_NAME = "ibm-plex-sans-arabic-fonts-6.4.0-1.4.noarch.rpm"
RPM_HASH = "4af830efc3db39ff894b17ee94006bf5703f63d6f84a4075d85c72cef0738c791fd45966fdc4a47de96c1970505d685d887b0cb4395596cdef89c80f3ac44518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibm-plex-sans-arabic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
