SUMMARY = "Image viewer widget for Gtk3"
DESCRIPTION = "The Gtk3::ImageView widget allows the user to zoom, pan and select the \
specified image and provides hooks to allow additional tools, e.g. painter, \
to be created and used. \
 \
Gtk3::ImageView is a Gtk3 port of Gtk2::ImageView. \
 \
To discuss Gtk3::ImageView or gtk3-perl, ask questions and flame/praise the \
authors, join gtk-perl-list@gnome.org at lists.gnome.org."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.0.0"

RPM_NAME = "perl-Gtk3-ImageView-12.0.0-1.9.noarch.rpm"
RPM_HASH = "d28dfb117a516fec27756d8254c7933b225bb0c78065e20c08825a461ade84aca23b3199ce518e7faef5dae7e62848641c5b7042912dc98baa8ccd271b87c76a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gtk3--ImageView \
perl-Gtk3--ImageView--Tool \
perl-Gtk3--ImageView--Tool--Dragger \
perl-Gtk3--ImageView--Tool--Selector \
perl-Gtk3--ImageView--Tool--SelectorDragger \
perl-Gtk3-ImageView"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cairo \
perl-Glib \
perl-Glib--Object--Subclass \
perl-Gtk3 \
perl-Readonly"

inherit rpm
