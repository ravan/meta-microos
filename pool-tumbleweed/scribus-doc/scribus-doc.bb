SUMMARY = "Documentation for Scribus"
DESCRIPTION = "This package provides the documentation for Scribus."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.6"

RPM_NAME = "scribus-doc-1.6.6-4.1.noarch.rpm"
RPM_HASH = "118e8d998801f4bef10ffabfccbc1dabb9cd12102a65ae2f64b439f127adf0b4331084e724ef794cd53e2387310d41c207ead16af2d9ae21bcf21256a9efaa57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scribus-doc"

RDEPENDS:${PN} += ""

inherit rpm
