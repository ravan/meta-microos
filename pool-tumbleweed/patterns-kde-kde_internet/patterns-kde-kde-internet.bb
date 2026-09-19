SUMMARY = "KDE Internet"
DESCRIPTION = "KDE Internet Applications"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_internet-20260830-1.1.noarch.rpm"
RPM_HASH = "7ad7a0e8297b76477ea87d83725cd202c39b66d81bf2b2cac70e0324353ddef6874e01a2feed1f238992c51d317c5a989427838ed5e2df640eaf435913710385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-internet \
patterns-openSUSE-kde-internet \
patterns-openSUSE-kde4-internet"

RDEPENDS:${PN} += ""

inherit rpm
