SUMMARY = "Documentation for texlive-dratex"
DESCRIPTION = "This package includes the documentation for texlive-dratex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-dratex-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "985da04b5f81abfc5e1d12df234e618d477ce9f395d7958a72a279a725ab0abdd2cfcd9b5a2cbe957b3253a8c6cc0f3fdc0d10840e87b8d8adcb231b00cf1288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dratex-doc"

RDEPENDS:${PN} += ""

inherit rpm
