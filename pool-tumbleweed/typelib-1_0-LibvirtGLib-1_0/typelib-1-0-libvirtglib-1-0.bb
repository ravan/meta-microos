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

RPM_NAME = "typelib-1_0-LibvirtGLib-1_0-5.0.0-2.8.aarch64.rpm"
RPM_HASH = "8db533e4a14aecdc4f377fd4a7aafd8e760694558ca559c48de7f3993da8604f6d32599c3ee34c89e581d4fbbf18ddef5d8419ebb13a92bad04d751229c856d0"

RPROVIDES:${PN} += "typelib-1-0-LibvirtGLib-1-0 \
typelib-LibvirtGLib"

RDEPENDS:${PN} += "libvirt-glib-1.0.so.0 \
typelib-GLib"

inherit rpm
