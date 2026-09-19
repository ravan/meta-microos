SUMMARY = "Documentation for texlive-fnspe"
DESCRIPTION = "This package includes the documentation for texlive-fnspe"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn45360"

RPM_NAME = "texlive-fnspe-doc-2026.226.1.2asvn45360-60.2.noarch.rpm"
RPM_HASH = "1e6ae8dadc587de615aa671392969bf0f418df064ae808930b9d938a9257329157d98efe9f3ef6b81d0bbf254299d4f65eda77d779628d52d5c5f8adf4de3f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnspe-doc"

RDEPENDS:${PN} += ""

inherit rpm
