SUMMARY = "Documentation for texlive-xespotcolor"
DESCRIPTION = "This package includes the documentation for texlive-xespotcolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-xespotcolor-doc-2026.226.2.1svn77682-59.4.noarch.rpm"
RPM_HASH = "f5f4afbd23776ebc69a3a432adc69fb42862c9913fbb9364b7d312f0068b56ca96b1a676f5df5412d840d386a3372271e3457e315c19edf48c1719d2c97baeda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xespotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
