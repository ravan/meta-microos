SUMMARY = "A Port of Tomboy to C++"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on."
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "gnote-50.2-1.1.aarch64.rpm"
RPM_HASH = "5496fc8b361507bdf7d003bab63862873dee1f9e42a430818ce8562864a71237532db8f8b3054761709dc86de8ab53e4e984d4a9e581aaa496bb3f567120428e"

RPROVIDES:${PN} += "gnote \
libbacklinks.so \
libbugzilla.so \
libexporttogtg.so \
libexporttohtml.so \
libfilesystemsyncservice.so \
libfixedwidth.so \
libgnote-50.so.0 \
libgvfssyncservice.so \
libinserttimestamp.so \
libnotedirectorywatcher.so \
libnoteoftheday.so \
libprintnotes.so \
libreadonly.so \
libreplacetitle.so \
libspecialnotes.so \
libstatistics.so \
libtableofcontents.so \
libtodo.so \
libtomboyimport.so \
libunderline.so \
libwebdavsyncservice.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairomm-1.16.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangomm-2.48.so.1 \
libsecret-1.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
