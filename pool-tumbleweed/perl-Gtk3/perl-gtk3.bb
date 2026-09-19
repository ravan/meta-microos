SUMMARY = "Perl interface to the 3.x series of the gtk+ toolkit"
DESCRIPTION = "The 'Gtk3' module allows a Perl developer to use the gtk+ graphical user \
interface library. Find out more about gtk+ at http://www.gtk.org. \
 \
The gtk+ reference manual is also a handy companion when writing 'Gtk3' \
programs in Perl: http://developer.gnome.org/gtk3/stable/. The Perl \
bindings follow the C API very closely, and the C reference documentation \
should be considered the canonical source. The principles underlying the \
mapping from C to Perl are explained in the documentation of \
Glib::Object::Introspection, on which 'Gtk3' is based. \
 \
Glib::Object::Introspection also comes with the 'perli11ndoc' program which \
displays the API reference documentation of all installed libraries \
organized in accordance with these principles."
LICENSE = "LGPL-2.1-or-later"

PV = "0.038"

RPM_NAME = "perl-Gtk3-0.038-1.28.noarch.rpm"
RPM_HASH = "4ac5f43409b7a86cdca30dd70694be10d388eceb66a9c277a474ec817979f59dcf6249fa53fc47e98ba40add204e98c93e0d685c14a8b543ab38d9b1bb67b9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gtk3 \
perl-Gtk3--Gdk--EventMask"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cairo--GObject \
perl-Glib--Object--Introspection \
perl-Test--Simple"

inherit rpm
