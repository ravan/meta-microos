SUMMARY = "Development files for parlatype"
DESCRIPTION = "Parlatype ships its own library, libparlatype, which provides a GStreamer backend (PtPlayer) and a waveviewer widget (PtWaveviewer) which is a GtkWidget."
LICENSE = "GPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "libparlatype-devel-4.3-1.6.aarch64.rpm"
RPM_HASH = "960e3f2b4c0227937a3d97dee282ca4c9bf24bb23f33492ee258a957cbd167d3238a8d57d6482fac3139674f89a87d156a15d049402638ea5a4591cd1a5ad697"

RPROVIDES:${PN} += "libparlatype-devel \
pkgconfig-parlatype"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparlatype7 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gtk4"

inherit rpm
