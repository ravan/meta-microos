SUMMARY = "Documentation for texlive-luatex-cn"
DESCRIPTION = "This package includes the documentation for texlive-luatex-cn"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.3.1svn78192"

RPM_NAME = "texlive-luatex-cn-doc-2026.226.0.0.3.1svn78192-59.2.noarch.rpm"
RPM_HASH = "6e971daed82a9e55a5c54b9ad95f312be1c29cded9a4de85b7e405fa86b1e48c1a86eadf319d2b4a386ce9f184a7f26a3e2d0f81348f52a872a80162486da9ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-luatex-cn-doc-zh \
texlive-luatex-cn-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
