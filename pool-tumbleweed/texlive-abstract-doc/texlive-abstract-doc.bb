SUMMARY = "Documentation for texlive-abstract"
DESCRIPTION = "This package includes the documentation for texlive-abstract"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77682"

RPM_NAME = "texlive-abstract-doc-2026.226.1.2asvn77682-61.2.noarch.rpm"
RPM_HASH = "655e2590e56dfb598fc32220d3fc0e631b91eb284bc595c65ee6cf0c11db169ce8f44462739fda315d3802854e07c7d859a76bfd913ebce43f7f53313e94785b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abstract-doc"

RDEPENDS:${PN} += ""

inherit rpm
