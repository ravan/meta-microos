SUMMARY = "GLib and GObject mapping of libvirt - Development files"
DESCRIPTION = "libvirt is a C toolkit to interact with the virtualization capabilities \
of recent versions of Linux (and other OSes). It is free software \
available under the GNU Lesser General Public License. Virtualization on \
the Linux Operating System means the ability to run multiple instances of \
Operating Systems concurrently on a single hardware system where the basic \
resources are driven by a Linux instance. The library aim at providing \
long term stable C API initially for the Xen paravirtualization but \
should be able to integrate other virtualization mechanisms if needed"
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.0"

RPM_NAME = "libvirt-glib-devel-5.0.0-2.8.aarch64.rpm"
RPM_HASH = "f58c980edcfb43c0adc27864bc37212bc827a1df8e7480db183f5c76a4a1fc5f7598c37dcaae7f4f8e0536c8b5e19c407dff53c34738c87cb2cabfb2527e5ca3"

RPROVIDES:${PN} += "libvirt-glib-devel \
pkgconfig-libvirt-gconfig-1.0 \
pkgconfig-libvirt-glib-1.0 \
pkgconfig-libvirt-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-glib-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libvirt \
pkgconfig-libvirt-gconfig-1.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-LibvirtGConfig-1-0 \
typelib-1-0-LibvirtGLib-1-0 \
typelib-1-0-LibvirtGObject-1-0"

inherit rpm
