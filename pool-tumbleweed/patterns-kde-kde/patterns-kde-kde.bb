SUMMARY = "KDE Applications and Plasma Desktop"
DESCRIPTION = "Packages providing the Plasma desktop environment and applications from KDE."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde-20260830-1.1.noarch.rpm"
RPM_HASH = "1614c31513152fda5831b03a57d45652ca1e9b563bdb5346615071a9a3f8c56a46a66ce768fddeff737746fb731a535b9b58f4f87e5266e46531455f06196346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde \
patterns-openSUSE-kde \
patterns-openSUSE-kde4"

RDEPENDS:${PN} += "pattern-"

inherit rpm
