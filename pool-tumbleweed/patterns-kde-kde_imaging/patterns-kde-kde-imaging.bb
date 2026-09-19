SUMMARY = "KDE Graphics"
DESCRIPTION = "KDE Applicatons - Handling of digital photos and graphics"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_imaging-20260830-1.1.noarch.rpm"
RPM_HASH = "f8d35e206c1b2d9588b16791a201897a9f98f7903e32ab9b33360de3beccbbdea9c9f2079b78cb7dc360553419319afc95cb52b64c55a7379f89904a6a5f3a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-imaging \
patterns-openSUSE-kde-imaging \
patterns-openSUSE-kde4-imaging"

RDEPENDS:${PN} += ""

inherit rpm
