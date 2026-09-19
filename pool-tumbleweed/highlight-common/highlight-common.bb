SUMMARY = "Common architecture-independent files for highlight"
DESCRIPTION = "This package provides some architecture-independent files for highlight such as \
configuration and themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-common-4.18-1.6.noarch.rpm"
RPM_HASH = "a0864aaf2f498e82c384a592840c309edb706171eda00bae4e920feccd470d211766d044a16b9f8e96c20a36ee79189f6d61d60aa59425cdab46c210d4c601b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-highlight-common \
highlight-common"

RDEPENDS:${PN} += ""

inherit rpm
