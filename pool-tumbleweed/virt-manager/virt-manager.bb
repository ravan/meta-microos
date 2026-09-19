SUMMARY = "Virtual Machine Manager"
DESCRIPTION = "Virtual Machine Manager provides a graphical tool for administering virtual \
machines for KVM, Xen, and QEmu. Start, stop, add or remove virtual devices, \
connect to a graphical or serial console, and see resource usage statistics \
for existing VMs on local or remote machines. Uses libvirt as the backend \
management API."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "virt-manager-5.1.0-16.1.noarch.rpm"
RPM_HASH = "d4bf2f8a0d203c0dc43653d0952f38071d463437023beed4595f932d30470e9f2c4bdbc5ed81f9bb92f23a5aa2ad0ecbcae1f7095e35f235fe9219815e454457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-manager"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
dconf \
gtk3 \
python3-gobject \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-GtkVnc \
typelib-LibvirtGLib \
typelib-Pango \
typelib-SpiceClientGLib \
typelib-SpiceClientGtk \
typelib-Vte \
virt-manager-common \
vte"

inherit rpm
