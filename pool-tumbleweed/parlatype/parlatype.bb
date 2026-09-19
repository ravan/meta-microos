SUMMARY = "GNOME audio player for transcriptions"
DESCRIPTION = "Parlatype is a minimal audio player for manual speech transcription, written for the GNOME desktop environment. It plays audio sources to transcribe them in your favourite text application."
LICENSE = "GPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "parlatype-4.3-1.6.aarch64.rpm"
RPM_HASH = "605f28ad54190a01f0af16285ec160169c7c9ea13c1f24d6f8ed37e83168d7b25ed326b82f45480ed1d3be787e3f6d82d66ea82afd31c57194f3fa8a8b75973f"

RPROVIDES:${PN} += "parlatype"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libparlatype.so.7 \
libparlatype7"

inherit rpm
