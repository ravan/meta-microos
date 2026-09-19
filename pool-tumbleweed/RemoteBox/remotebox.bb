SUMMARY = "A VirtualBox client with remote management"
DESCRIPTION = "VirtualBox is traditionally considered to be a virtualization solution aimed \
at the desktop as opposed to other solutions such as KVM, Xen and VMWare ESX \
which are considered more server orientated solutions. While it is certainly \
possible to install VirtualBox on a server, it offers few remote management \
features beyond using the vboxmanage command line. RemoteBox aims to fill \
this gap by providing a graphical VirtualBox client which is able to \
communicate with and manage a VirtualBox server installation."
LICENSE = "GPL-2.0-or-later"

PV = "3.7"

RPM_NAME = "RemoteBox-3.7-1.2.noarch.rpm"
RPM_HASH = "5795583ff114fda173e4c8a36f125188d5dad6334c3408702eb4ff90897ef138751b05e0c8e22670747321bc71c646c19d32da5d934adf86139393d865135fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "RemoteBox"

RDEPENDS:${PN} += "/usr/bin/perl \
freerdp \
perl-Gtk3 \
perl-SOAP-Lite \
typelib-1-0-GdkPixdata-2-0 \
xdg-utils"

inherit rpm
