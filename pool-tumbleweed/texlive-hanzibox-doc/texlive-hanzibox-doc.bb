SUMMARY = "Documentation for texlive-hanzibox"
DESCRIPTION = "This package includes the documentation for texlive-hanzibox"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn77682"

RPM_NAME = "texlive-hanzibox-doc-2026.226.2.3.0svn77682-60.4.noarch.rpm"
RPM_HASH = "105ccd1e3d30c89c8d4e40474f2eda63e8d75782c8259b594d8f01b1e57878e63766ae8d7953679ce312484a46e91d90915ab1afe80012851fc5a736cab389ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hanzibox-doc-zh \
texlive-hanzibox-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
