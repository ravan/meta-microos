SUMMARY = "Data files for the liblouis two-way braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. \
 \
This package contains data required by main package."
LICENSE = "LGPL-3.0-or-later"

PV = "3.39.0"

RPM_NAME = "liblouis-data-3.39.0-1.1.noarch.rpm"
RPM_HASH = "0f73aed5f0f85265751908e881f6e82478449c89a3161ffa7c221853c54fc4c0a3a039b97682d4bf51db40978dba099d176aa4174ca5e76bd2c9e3259e998671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblouis-data"

RDEPENDS:${PN} += ""

inherit rpm
