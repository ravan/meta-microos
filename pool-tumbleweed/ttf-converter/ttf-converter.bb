SUMMARY = "Python script that converts fonts to TrueType format"
DESCRIPTION = "This is a Python script that converts fonts to TrueType/OpenType \
format. It uses the FontForge Python bindings to read/process and \
write any font format. Also, as part of the conversion process, the \
script tries to fix inconsistencies and do necessary changes to the \
font to honor the TTF/OTF format specs. \
 \
Though TrueType is often used synonymously with outline fonts, it \
supports embedded bitmaps. ttf-converter leaves the glyph kind \
(outline/bitmapped) unchanged. \
 \
For converting a font to have scalable outline glyphs, see vfontas \
instead."
LICENSE = "GPL-3.0-only"

PV = "1.0.7"

RPM_NAME = "ttf-converter-1.0.7-3.8.noarch.rpm"
RPM_HASH = "e3ce4fcc3084db9ff83c7b1edb047a81d6878fa8adcb1e01102afaf5cd5caa6788638202be8aa58d34ff0c761137eb381fee16b628d0170451edf3afec0a7f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ttf-converter"

RDEPENDS:${PN} += "/usr/bin/python3 \
fontforge \
ftdump \
python313-base"

inherit rpm
