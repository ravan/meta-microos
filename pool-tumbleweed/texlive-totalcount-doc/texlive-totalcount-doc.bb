SUMMARY = "Documentation for texlive-totalcount"
DESCRIPTION = "This package includes the documentation for texlive-totalcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-totalcount-doc-2026.226.1.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "8e69314824bf5355f775bc6de7f061addb22ff6fa7ee02a72e251b1905ace332647f5e4d4f235d7a4e76d1990e76d1abac384cba84108cbd1d0ee187594aab46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totalcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
