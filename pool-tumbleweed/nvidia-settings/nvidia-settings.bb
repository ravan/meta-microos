SUMMARY = "Configure the NVIDIA graphics driver"
DESCRIPTION = "The nvidia-settings utility is a tool for configuring the NVIDIA graphics \
driver. It operates by communicating with the NVIDIA X driver, querying and \
updating state as appropriate. \
 \
This communication is done with the NV-CONTROL X extension."
LICENSE = "GPL-2.0-only"

PV = "580.159.03"

RPM_NAME = "nvidia-settings-580.159.03-1.3.aarch64.rpm"
RPM_HASH = "f9b41dc52568aa890cc115470009aa06d6fe914a6a48c86959ed495b409e2c4bfc537486bbda9e9658083ebe79d76a4e6f2bb261b0e78e70a4eb73df2afbe863"

RPROVIDES:${PN} += "libnvidia-gtk3.so.580.159.03 \
libnvidia-wayland-client.so.580.159.03 \
nvidia-settings"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libXxf86vm.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjansson.so.4 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libvdpau1 \
libwayland-client.so.0 \
nvidia-libXNVCtrl"

inherit rpm
