SUMMARY = "Documentation for texlive-betababel"
DESCRIPTION = "This package includes the documentation for texlive-betababel"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-betababel-doc-2026.226.0.0.5svn15878-61.2.noarch.rpm"
RPM_HASH = "029a825935663b4367986c17942d5ef73a9e8b2a73e85666daffeee90f64fba9633f74deddb61b150032682ec3461b2d8e253386ee09c2ec0ddeb95fde839d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-betababel-doc"

RDEPENDS:${PN} += ""

inherit rpm
