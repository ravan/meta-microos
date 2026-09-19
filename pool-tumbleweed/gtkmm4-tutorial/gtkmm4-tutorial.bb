SUMMARY = "C++ Bindings for GTK+ -- Tutorial"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm wraps \
GTK+. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "gtkmm4-tutorial-4.14.0-1.1.noarch.rpm"
RPM_HASH = "88dc36a1d99d494bc1b186a70db4b8e0f76581bc9576f0052c0c472afdf206fb0477b789d4561eb45865d6597a413252fbf1831e801b3b28bacea43ed4816df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm-documentation \
gtkmm-tutorial \
gtkmm4-documentation \
gtkmm4-tutorial"

RDEPENDS:${PN} += "gtkmm4-doc"

inherit rpm
