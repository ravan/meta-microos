SUMMARY = "Static libraries for the FLTK GUI toolkit"
DESCRIPTION = "The Fast Light Tool Kit ('FLTK', pronounced 'fulltick') is a C++ \
graphical user interface toolkit for the X Window System, \
OpenGL, and Microsoft Windows NT 4.0, 95, or 98. The \
installation of this package requires a 3D library such as Mesa."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.11"

RPM_NAME = "fltk-devel-static-1.3.11-1.9.aarch64.rpm"
RPM_HASH = "e9ddb27db681aa2211afc1ac59cc0139802815bc708535991d09eae91a738d0907788fc61fb6b016ae77d7f8b8e40b2083fd7fa571a78bf72d229bf0e449ab0f"

RPROVIDES:${PN} += "fltk-devel-static"

RDEPENDS:${PN} += "fltk-devel \
libfltk1-3"

inherit rpm
