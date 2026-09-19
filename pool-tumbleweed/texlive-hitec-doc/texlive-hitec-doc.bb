SUMMARY = "Documentation for texlive-hitec"
DESCRIPTION = "This package includes the documentation for texlive-hitec"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-doc-2026.226.0.0.0betasvn15878-60.4.noarch.rpm"
RPM_HASH = "1f02742f4050e056283dc531346aefc76afb57fe851301c379f4c3c7f866d22cc2b560f89e2c9a230b8cb4bb0bd42375bd103e80daa9c1e69d4912f133d58f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hitec-doc"

RDEPENDS:${PN} += ""

inherit rpm
