SUMMARY = "An email reader for the GNOME desktop"
DESCRIPTION = "Geary is a email reader for GNOME. \
 \
Its interface is based on conversations, so entire discussion \
may be read without having to navigate between messages."
LICENSE = "BSD-2-Clause & CC-BY-3.0 & LGPL-2.1-or-later"

PV = "46.0+109"

RPM_NAME = "geary-46.0+109-3.3.aarch64.rpm"
RPM_HASH = "6e48494303975700a032207cadcdf8334b69f06e2edf3bb3b8d02ada81742b24dbdc2d85b5fa6a24a7d1f1cb89f80c7d98320683f30b1e7a7453a2dd6925a811"

RPROVIDES:${PN} += "geary \
libdesktop-notifications.so \
libemail-templates.so \
libfolder-highlight.so \
libgeary-client-46.0.so \
libgeary-web-process.so \
libmail-merge.so \
libnotification-badge.so \
libsent-sound.so \
libspecial-folders.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libfolks.so.26 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgspell-1.so.3 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libicuuc.so.78 \
libjavascriptcoregtk-4.1.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-2.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libstemmer.so.0d \
libunwind.so.8 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.16"

inherit rpm
