SUMMARY = "Introspection bindings for the malcontent UI library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "typelib-1_0-MalcontentUi-1-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "037a13b1290e0c9082c34992bc7e423e026567fd4f1911365f4fbd102e0b1e54764700f6d7101c14d84a91376aa10e8dc4035d84368d54d664b3cb7cfb5329a8"

RPROVIDES:${PN} += "typelib-1-0-MalcontentUi-1 \
typelib-MalcontentUi"

RDEPENDS:${PN} += "libmalcontent-ui-1.so.1 \
typelib-AccountsService \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Malcontent \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
