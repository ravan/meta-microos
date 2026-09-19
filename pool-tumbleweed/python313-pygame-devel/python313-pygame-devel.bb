SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-2-Clause & BSD-3-Clause & libpng-2.0"

PV = "2.6.1"

RPM_NAME = "python313-pygame-devel-2.6.1-3.3.aarch64.rpm"
RPM_HASH = "6a35077c18ab5d17aac40df72de6102a2ee8e035dc9b389ff839cb904c1ed2f20ee1861143fc6ce1024617f2cb4927095de60120115dc456074870f8933febae"

RPROVIDES:${PN} += "python3-pygame-devel \
python313-pygame-devel"

RDEPENDS:${PN} += "python313-pygame"

inherit rpm
