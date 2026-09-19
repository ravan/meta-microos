SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts. With it, you can \
create new fonts or modify old ones. It also converts font formats and \
can convert among PostScript, TrueType, OpenType, and CID-keyed fonts. \
 \
This subpackage contains all necessary include files and libraries needed \
to develop applications that use FontForge libraries."
LICENSE = "GPL-3.0-or-later"

PV = "20251009"

RPM_NAME = "fontforge-devel-20251009-7.3.aarch64.rpm"
RPM_HASH = "e33b82916cd8a4d1a9a9ce740c775c51fc138eb0c63c08547df370f46e499601ca9ad04a46f064fbe94b0fbb30510b5b683851c72476824f6a83a2e527be6dd5"

RPROVIDES:${PN} += "fontforge-devel"

RDEPENDS:${PN} += "fontforge \
freetype2-devel"

inherit rpm
