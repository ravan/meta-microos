SUMMARY = "Gerber File Viewer that supports the RS-274X Standard"
DESCRIPTION = "Gerber Viewer (gerbv) is a viewer for Gerber files. Gerber files are \
generated from PCB CAD system and sent to PCB manufacturers as basis \
for the manufacturing process. The standard supported by gerbv is \
RS-274X. The basic difference between RS-274D (the old standard) and \
RS-274X is basically the addition of apertures in RS-274X. It might be \
possible to make an RS-274X file out of an RS-274D file and an \
aperture list."
LICENSE = "GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "gerbv-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "28661e9a918895b1652c39b3e8afe272698f6a48c510f0d9eb072162edf226c368792107dac0c88a8039563351a9c9cffafbc99e4421fdb3f8ac131cc3f14f9c"

RPROVIDES:${PN} += "gerbv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgerbv.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
