SUMMARY = "Documentation for Guake"
DESCRIPTION = "Guake is a dropdown terminal made for the GNOME desktop environment. \
 \
This package provides the HTML documentation for Guake."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "guake-doc-3.10-7.5.noarch.rpm"
RPM_HASH = "5f4b912222f06c2ef0f2b256d80b3343476e3579f790954919473f20be406bff36cd6545c400fbaa927aa6807996084a23ac4c2f40cb9caf6c054a34e507b090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake-doc"

RDEPENDS:${PN} += "guake"

inherit rpm
