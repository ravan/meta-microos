SUMMARY = "Simple CD/DVD Burning Application"
DESCRIPTION = "Xfburn is a simple CD/DVD burning application based on the libburnia libraries. \
It can blank CD-RWs, burn and create iso images, as well as burn personal \
compositions of data to either CD or DVD."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "xfburn-0.8.0-1.6.aarch64.rpm"
RPM_HASH = "41c4efb2ccb72e075aaf37d22962412bd6a558d4d7afe88faa78423d3b751dcd05d2486543a20a79af1fba36fb61ae1cf04790975c0fe311324db0847305b078"

RPROVIDES:${PN} += "xfburn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libisofs.so.6 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
