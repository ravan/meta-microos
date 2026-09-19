SUMMARY = "Documentation for texlive-tkz-fct"
DESCRIPTION = "This package includes the documentation for texlive-tkz-fct"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7csvn61949"

RPM_NAME = "texlive-tkz-fct-doc-2026.226.1.7csvn61949-59.2.noarch.rpm"
RPM_HASH = "c7d079e7b0e38eb6f1b522fcc7bd388f175e0c29e0b9a2905902194541b98a2df1fbff4256392481d5b229f49836ba74f99f1c74c077415c2b6ec13d0bb8cb99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tkz-fct-doc-fr \
texlive-tkz-fct-doc"

RDEPENDS:${PN} += ""

inherit rpm
