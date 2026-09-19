SUMMARY = "The GNU Image Manipulation Program"
DESCRIPTION = "The GIMP is an image composition and editing program, which can be \
used for creating logos and other graphics for Web pages. The GIMP \
offers many tools and filters, and provides a large image \
manipulation toolbox, including channel operations and layers, \
effects, subpixel imaging and antialiasing, and conversions, together \
with multilevel undo. The GIMP offers a scripting facility, but many \
of the included scripts rely on fonts that we cannot distribute."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "gimp-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "5f6097e53790acf182a6b44bf7425a2c4ac79daf222f8f41245e77507f822ddc3259920eec4a16b163f7ebd9904e9fb3888da78e91d89ce1012ccee339aca2e6"

RPROVIDES:${PN} += "config-gimp \
gimp \
gimp-3.0 \
gimp-abi \
gimp-api \
libcolor-selector-cmyk.so \
libcolor-selector-water.so \
libcolor-selector-wheel.so \
libcontroller-linux-input.so \
libcontroller-midi.so \
libdisplay-filter-aces-rrt.so \
libdisplay-filter-clip-warning.so \
libdisplay-filter-color-blind.so \
libdisplay-filter-gamma.so \
libdisplay-filter-high-contrast.so \
typelib-Gimp \
typelib-GimpUi"

RDEPENDS:${PN} += "-typelib-1-0-GExiv2-0-10 >= 0.14.3 with typelib-1-0-GExiv2-0-10 < 0.15.0 \
/usr/bin/env \
gegl-0-4 \
gjs \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libOpenEXR-3-4.so.33 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXmu.so.6 \
libXpm.so.4 \
libappstream.so.5 \
libarchive.so.13 \
libasound.so.2 \
libbabl-0.1.so.0 \
libbacktrace.so.0 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libcfitsio.so.10 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0.4.so.0 \
libgegl-npd-0.4.so \
libgexiv2.so.2 \
libgimp-3-0-0 \
libgimp-3.0.so.0 \
libgimp-scriptfu-3.0.so.0 \
libgimpbase-3.0.so.0 \
libgimpcolor-3.0.so.0 \
libgimpconfig-3.0.so.0 \
libgimpmath-3.0.so.0 \
libgimpmodule-3.0.so.0 \
libgimpthumb-3.0.so.0 \
libgimpui-3-0-0 \
libgimpui-3.0.so.0 \
libgimpwidgets-3.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgs.so.10 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libharfbuzz.so.0 \
libheif-aom \
libheif.so.1 \
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblcms2.so.2 \
liblzma.so.5 \
libm.so.6 \
libmng.so.2 \
libmypaint.so.0 \
libopenjp2.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libpoppler-glib.so.8 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libunwind.so.8 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libz.so.1 \
shared-mime-info \
typelib-1-0-Babl-0-1 \
typelib-1-0-Gegl-0-4 \
typelib-Atk \
typelib-Babl \
typelib-GExiv2 \
typelib-GLib \
typelib-GLibUnix \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gegl \
typelib-Gio \
typelib-GioUnix \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib \
xdg-utils"

inherit rpm
