SUMMARY = "Typelib for ibis"
DESCRIPTION = "Typelib for ibis."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.0"

RPM_NAME = "typelib-1_0-Ibis-1_0-0.16.0-1.3.aarch64.rpm"
RPM_HASH = "a8b302204870b089c31de2216ccc101be0664e61df5548ac221175dd67bf25fada62ccf00ec9bc8b3a699e17ccbf06365979de1f7313263ed799baa805263c00"

RPROVIDES:${PN} += "typelib-1-0-Ibis-1-0 \
typelib-Ibis"

RDEPENDS:${PN} += "libibis.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-HarfBuzz \
typelib-Hasl \
typelib-Pango \
typelib-cairo \
typelib-freetype2"

inherit rpm
