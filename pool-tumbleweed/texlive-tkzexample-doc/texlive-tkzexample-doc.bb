SUMMARY = "Documentation for texlive-tkzexample"
DESCRIPTION = "This package includes the documentation for texlive-tkzexample"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.45csvn63908"

RPM_NAME = "texlive-tkzexample-doc-2026.226.1.45csvn63908-59.2.noarch.rpm"
RPM_HASH = "eb482ddb43213b73dfa1b7c5dafed398498473a0bcbf7b9593a55d885aa11b0bd6e648b626a1ce94f7adbb2b3157d5ed9e4bc1d5528dc691fef70efb3a301982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkzexample-doc"

RDEPENDS:${PN} += ""

inherit rpm
