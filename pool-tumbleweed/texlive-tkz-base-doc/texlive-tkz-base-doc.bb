SUMMARY = "Documentation for texlive-tkz-base"
DESCRIPTION = "This package includes the documentation for texlive-tkz-base"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.21csvn69460"

RPM_NAME = "texlive-tkz-base-doc-2026.226.4.21csvn69460-59.2.noarch.rpm"
RPM_HASH = "499ca7de3523df3f421f3b2a8cebc934ec1139ace5fb71a60b05485e43cb0c77c3e5fd612c299a97caaf73e03e91934dff5042deb62732fb9a8a8c5ca628d959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-base-doc-fr \
texlive-tkz-base-doc"

RDEPENDS:${PN} += ""

inherit rpm
