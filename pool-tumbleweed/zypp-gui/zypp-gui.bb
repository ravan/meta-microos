SUMMARY = "Update the system, search, install and remove the package, configure the repos."
DESCRIPTION = "Application can update the system, search, install and remove the package, configure the repos. It achieves some functions of command zypper."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "zypp-gui-0.4.1-2.7.aarch64.rpm"
RPM_HASH = "12b443040bdd580ba14fbe7f2e158079588067c66999b8c56e8fc09422ba5e1cb09eff3550719d6d7fea1219fa368c2a6d264dbcdc37617d27291893fd101958"

RPROVIDES:${PN} += "zypp-gui"

RDEPENDS:${PN} += "PackageKit \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpackagekit-glib2.so.18 \
libpango-1.0.so.0 \
pkexec"

inherit rpm
