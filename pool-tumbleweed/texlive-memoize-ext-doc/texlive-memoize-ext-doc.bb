SUMMARY = "Documentation for texlive-memoize-ext"
DESCRIPTION = "This package includes the documentation for texlive-memoize-ext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn78219"

RPM_NAME = "texlive-memoize-ext-doc-2026.226.0.0.2svn78219-59.2.noarch.rpm"
RPM_HASH = "c303bd9468f7ad892d6b91aa64ea4271b6e3729bb6904c5a01a74e56452c3a024cc08fc2f3c8a6569e5b731ad0253031b412a74d0b849e4f046a47f4d085978d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoize-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm
