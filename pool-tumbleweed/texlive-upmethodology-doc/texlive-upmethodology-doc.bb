SUMMARY = "Documentation for texlive-upmethodology"
DESCRIPTION = "This package includes the documentation for texlive-upmethodology"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.20250429svn75054"

RPM_NAME = "texlive-upmethodology-doc-2026.226.20250429svn75054-60.2.noarch.rpm"
RPM_HASH = "23472bd8ef21ed352df60752227e47995f9263c38309eb10594f310b57248486f75fdc943e3a4e1a2eb467750f28fa726f9275c1e55e9d6c238de4fb6d80414d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upmethodology-doc"

RDEPENDS:${PN} += ""

inherit rpm
