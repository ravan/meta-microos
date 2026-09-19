SUMMARY = "GUI to combine photos to get deeper DOF or HDR"
DESCRIPTION = "MacroFusion is a neat little GUI for great tool Enfuse \
(command line) It makes easy fusion few photos to one with great \
DOF (Depth of Field) or DR (Dynamic Range) \
It can be useful for enthusiasts of landscape or macro imagery. \
 \
MacroFusion is a fork of EnfuseGui of Chez Gholyo and has been \
rebranded to avoid conflict with another EnfuseGui (for MacOS)."
LICENSE = "GPL-3.0-only"

PV = "0.7.4"

RPM_NAME = "macrofusion-0.7.4-6.8.noarch.rpm"
RPM_HASH = "b77748c6ff759494567fbe7f13db880a85e55f31e88e80cce5095c66466f8180065d4f3e1956150aa8962678855d156995f7594f227eec4847aa3f0a380230d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "macrofusion"

RDEPENDS:${PN} += "/usr/bin/python3 \
enblend-enfuse \
hugin \
python3-Pillow \
python3-cairo \
python3-gobject-Gdk \
typelib-GExiv2 \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk"

inherit rpm
