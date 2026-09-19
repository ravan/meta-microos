SUMMARY = "KDE PIM Suite"
DESCRIPTION = "The KDE PIM Suite (Kontact, KMail, KOrganizer, ...)."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_pim-20260830-1.1.noarch.rpm"
RPM_HASH = "daca07a73d9d67d50ae0210eb6c790a724614f46a0798a3a7283bb680e5021ad8ece44cb4a17c7e0b5323ac1e955a083956ad0175451ede9607525ef8e625aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde-pim"

RDEPENDS:${PN} += ""

inherit rpm
