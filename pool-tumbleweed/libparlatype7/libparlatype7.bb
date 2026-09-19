SUMMARY = "Library for parlatype"
DESCRIPTION = "Parlatype ships its own library, libparlatype, which provides a GStreamer backend (PtPlayer) and a waveviewer widget (PtWaveviewer) which is a GtkWidget."
LICENSE = "GPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "libparlatype7-4.3-1.6.aarch64.rpm"
RPM_HASH = "ce305f448bea62d4aa468e9fd443a1081bf07404114b6eabfbd3b0282ce395a6068e8804ef062caf7cf5e11102a0d20257e4e9988d95655f4fcd3b6e95fdc42b"

RPROVIDES:${PN} += "libparlatype.so.7 \
libparlatype7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
