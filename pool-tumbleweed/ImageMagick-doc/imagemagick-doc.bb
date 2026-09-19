SUMMARY = "Document Files for ImageMagick Library"
DESCRIPTION = "HTML documentation for ImageMagick library and scene examples."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-doc-7.1.2.30-1.1.noarch.rpm"
RPM_HASH = "a69f9041a2b98090dd251afdfd36b96a182fb157f47cbd38f9b5754847c915472af981e80e8e14b2f56903cec4f0b73217df1a1e55ad9b0afacca9496a58c086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-doc"

RDEPENDS:${PN} += ""

inherit rpm
