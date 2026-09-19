SUMMARY = "Documentation for FontForge"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts. With it, you can \
create new fonts or modify old ones. It also converts font formats and \
can convert among PostScript, TrueType, OpenType, and CID-keyed fonts. \
 \
This subpackage contains the documentation to FontForge."
LICENSE = "GPL-3.0-or-later"

PV = "20251009"

RPM_NAME = "fontforge-doc-20251009-7.3.noarch.rpm"
RPM_HASH = "49635a8450986d1369e332d69dc0ad0b7e94f0b62045fdf3d9f5085ac7f810c19615b8fe83a9348bb096cc4ac06732930cf422abc5b529d87865f279a3bc3523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontforge-doc"

RDEPENDS:${PN} += ""

inherit rpm
