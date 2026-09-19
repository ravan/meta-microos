SUMMARY = "Documentation for Garlic, a molecular graphics visualization tool"
DESCRIPTION = "Garlic is an X Window System tool intended for the molecular \
visualization of protein structure, DNA structure, and biological \
macromolecules. \
This subpackage contains the full documentation to Garlic."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "garlic-doc-1.6-223.11.noarch.rpm"
RPM_HASH = "77e1cd811255ca35ea2a42e8bc4a4122c09a182c07378443740d21ba35113b9e96536985a1f13b865bca0630475cda381fa54da7eedd507de7c0b6da573d6147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "garlic-doc"

RDEPENDS:${PN} += ""

inherit rpm
