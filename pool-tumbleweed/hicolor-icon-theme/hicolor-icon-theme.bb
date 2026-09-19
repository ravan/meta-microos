SUMMARY = "Fallback Icon Theme"
DESCRIPTION = "This is the default fallback theme used by implementations of the icon \
theme specification."
LICENSE = "GPL-2.0-or-later"

PV = "0.18"

RPM_NAME = "hicolor-icon-theme-0.18-1.6.noarch.rpm"
RPM_HASH = "fef6fcd0aa07a77a9f94f330a2908caacda975e42b5b8ef96401eb2767c200e568648ffe7a13a0bd78f50644a77981dbb995e8a5f7343b1604a2ab80423c29ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hicolor-icon-theme \
rpm-macro-icon-theme-cache-create-ghost \
rpm-macro-icon-theme-cache-post \
rpm-macro-icon-theme-cache-postun"

RDEPENDS:${PN} += ""

inherit rpm
