SUMMARY = "Documentation for gtkcam"
DESCRIPTION = "Documentation for gtkam."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "gtkam-doc-1.1-4.4.aarch64.rpm"
RPM_HASH = "5d79f171817c0cacb6a7c5e6d6c16e3ce015edb15552bb6f5bf7ab3d27ddaf8391a3880d12bb685fefcc4f36e833ad60181b6f0587b6d66b6d1b4d12839a99d6"

RPROVIDES:${PN} += "gtkam-doc"

RDEPENDS:${PN} += "gtkam"

inherit rpm
