SUMMARY = "Documentation for openslide"
DESCRIPTION = "This package contains documentation for developing with openslide library."
LICENSE = "LGPL-2.1-only"

PV = "4.0.1"

RPM_NAME = "openslide-doc-4.0.1-1.1.noarch.rpm"
RPM_HASH = "a5fb571e8b7057571e3e585e080b804452f75073d2022069229b9d4acdf6094ae7abe98c3c0e6f3c6edd01180f94e12837857881d38dec8b493acee0c31130cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
