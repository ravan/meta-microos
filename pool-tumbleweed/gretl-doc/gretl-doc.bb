SUMMARY = "Documentation for gretl"
DESCRIPTION = "This package provides the guide and command reference documentation (as PDF) \
for gretl."
LICENSE = "GPL-3.0-only"

PV = "2025a"

RPM_NAME = "gretl-doc-2025a-1.7.noarch.rpm"
RPM_HASH = "df69e32973dcf04f5912223dea8803293575a38cd19b9e712ea86eda93a69a19b69a161c2f13ab58c4a5f37131d9b98d064135c5e2a19ff6ea258fd39731f256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gretl-doc"

RDEPENDS:${PN} += ""

inherit rpm
