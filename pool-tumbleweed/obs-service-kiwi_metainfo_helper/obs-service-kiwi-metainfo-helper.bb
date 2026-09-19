SUMMARY = "Service for substituting various variables in build recipes"
DESCRIPTION = "This service can be used during buildtime to gain access to various variables \
in build recipes."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "obs-service-kiwi_metainfo_helper-0.6-11.1.noarch.rpm"
RPM_HASH = "9983b78dff908344c3ae5b92596693ae8652997c13dffabe0cd75ce0c1dc278a7113b409a4388ab486e551a9fae5dfbf02897eb485de7ded6fa50f33307ac20a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-kiwi-metainfo-helper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/cpio \
/usr/bin/find \
/usr/bin/grep \
/usr/bin/rpm2cpio \
/usr/bin/sed"

inherit rpm
