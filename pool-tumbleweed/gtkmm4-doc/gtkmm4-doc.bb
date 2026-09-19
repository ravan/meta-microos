SUMMARY = "C++ Interface for GTK4 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.22.0"

RPM_NAME = "gtkmm4-doc-4.22.0-1.3.noarch.rpm"
RPM_HASH = "b2fa971cf9ac541a83483b544a91bdfb12fe70738f1c07fc283c6d50d53a5a18141beaf6b7063ccf6807e9b32fe7fbf2f3d41325427ec9600705bf0b8817787d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm4-doc"

RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
