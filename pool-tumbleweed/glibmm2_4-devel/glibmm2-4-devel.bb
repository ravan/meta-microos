SUMMARY = "C++ Interface for GLib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.10"

RPM_NAME = "glibmm2_4-devel-2.66.10-1.1.aarch64.rpm"
RPM_HASH = "f56e322bab9c1718e01e5e2fb352ecacfd25c51767e72ed5d8aed0f0a641ae9f68712b410744fe74d4ae1163259d713f0ea06b6cb6248e30c785a242139570f2"

RPROVIDES:${PN} += "glibmm2-4-devel \
glibmm2-4-doc \
glibmm2-devel \
glibmm24-devel \
perl-DocsParser \
perl-Enum \
perl-Function \
perl-FunctionBase \
perl-GtkDefs \
perl-GtkDefs--Function \
perl-GtkDefs--Signal \
perl-Object \
perl-Output \
perl-Property \
perl-Util \
perl-WrapParser \
pkgconfig-giomm-2.4 \
pkgconfig-glibmm-2.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgiomm-2-4-1 \
libglibmm-2-4-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-glibmm-2.4 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-sigc++-2.0"

inherit rpm
