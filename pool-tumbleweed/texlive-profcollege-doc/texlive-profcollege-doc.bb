SUMMARY = "Documentation for texlive-profcollege"
DESCRIPTION = "This package includes the documentation for texlive-profcollege"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99_a_osvn77090"

RPM_NAME = "texlive-profcollege-doc-2026.226.0.0.99_a_osvn77090-59.2.noarch.rpm"
RPM_HASH = "129472b61e9706fa2e60b8a62ee219f5f259acc08367cfde4728c92bc7387514b2daa736d9818f1bcfa8f442c90c3c9574864d94297d330c23651c8641eac592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-profcollege-doc-fr \
texlive-profcollege-doc"

RDEPENDS:${PN} += ""

inherit rpm
