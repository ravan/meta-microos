SUMMARY = "Translations for package colorpicker"
DESCRIPTION = "Provides translations for the 'colorpicker' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "colorpicker-lang-1.1.5-2.9.noarch.rpm"
RPM_HASH = "e790f0a11ce9f722fa9c1edc8dd5cebb6fe34e069e0fdf8b3bd8784c69df32b06fad749728c540a52c21d945dfb924b0eafd6b1dee936311eb01e8515b33a8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colorpicker-lang \
colorpicker-lang-all \
locale-colorpicker-bg \
locale-colorpicker-ca \
locale-colorpicker-de \
locale-colorpicker-es \
locale-colorpicker-fr \
locale-colorpicker-nl \
locale-colorpicker-pl \
locale-colorpicker-pt-PT \
locale-colorpicker-tr"

RDEPENDS:${PN} += "colorpicker"

inherit rpm
