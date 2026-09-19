SUMMARY = "C++ Binding for the ATK library -- Documentation"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides the documentation files for the ATK library's \
C++ bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.36.4"

RPM_NAME = "atkmm-doc-2.36.4-1.3.noarch.rpm"
RPM_HASH = "0fea1a2f709ad743c3f9ef505489dd2885eb90281da5e52d55058800a9ae0abc4bb765e62be041f0a196ae48416dfb3ade5d9572cde78a38e12331be006fe8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atkmm-doc"

RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
