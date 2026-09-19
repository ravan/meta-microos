SUMMARY = "C++ Interface for GTK3 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "gtkmm3-doc-3.24.11-1.3.noarch.rpm"
RPM_HASH = "4ed8721f1a04c987e63ca6709e8a3b9864621318f993ddb5f758cd8b0db5865aa14396cecb30ce54ba8f79bd77367aaa3def1108ea774892d954cd40d1fd8c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm3-doc"

RDEPENDS:${PN} += ""

inherit rpm
