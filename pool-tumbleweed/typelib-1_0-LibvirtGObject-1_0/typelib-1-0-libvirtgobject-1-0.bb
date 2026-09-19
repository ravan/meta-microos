SUMMARY = "GLib and GObject mapping of libvirt - gi-bindings"
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

RPM_NAME = "typelib-1_0-LibvirtGObject-1_0-5.0.0-2.8.aarch64.rpm"
RPM_HASH = "931077de51bb06c7982ec2f5d1618539fc7bba633d9bd5ba0344ae9408e3c50b04307651ded46747907a17d1c78de02f28db03b1f202330b3d148e155bca6b12"

RPROVIDES:${PN} += "typelib-1-0-LibvirtGObject-1-0 \
typelib-LibvirtGObject"

RDEPENDS:${PN} += "libvirt-gobject-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-LibvirtGConfig \
typelib-LibvirtGLib \
typelib-libxml2"

inherit rpm
