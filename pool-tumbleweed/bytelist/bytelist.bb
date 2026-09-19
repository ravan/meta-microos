SUMMARY = "A java library for lists of bytes"
DESCRIPTION = "A small java library for manipulating lists of bytes."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.15"

RPM_NAME = "bytelist-1.0.15-2.8.noarch.rpm"
RPM_HASH = "fc8d5ae990de24ce2d0b668599f83dc58e943f7deea8bdac28c92ebb8f8765120e59d82f51aa3cdfd4789b46b14d8838fe432bf59a0b37625bf0c42d4aeee611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bytelist"

RDEPENDS:${PN} += "java \
javapackages-tools \
jcodings"

inherit rpm
