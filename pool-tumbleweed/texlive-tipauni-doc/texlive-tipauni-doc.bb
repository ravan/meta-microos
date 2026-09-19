SUMMARY = "Documentation for texlive-tipauni"
DESCRIPTION = "This package includes the documentation for texlive-tipauni"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7asvn65817"

RPM_NAME = "texlive-tipauni-doc-2026.226.0.0.7asvn65817-59.2.noarch.rpm"
RPM_HASH = "25b5ec746f6e12bb7cd9eefde7b935468cf8baa501a87a70b0174993ca29ae166dc8df7232321bdab25d9b5c07ea014c6cfeefeca5da0520dddcbb504a8a541e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tipauni-doc"

RDEPENDS:${PN} += ""

inherit rpm
