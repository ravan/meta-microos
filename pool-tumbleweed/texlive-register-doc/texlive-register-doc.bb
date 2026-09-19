SUMMARY = "Documentation for texlive-register"
DESCRIPTION = "This package includes the documentation for texlive-register"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn54485"

RPM_NAME = "texlive-register-doc-2026.226.2.0svn54485-60.4.noarch.rpm"
RPM_HASH = "b1beef8a056e6c240d8ff6d27efd103e64169c62d5f12324d40ee19e15ded1f893ad1a26c4f5294b152baa838829c0d0e4f05ee21952b69a7763dd83f0214f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Reg-macro \
texlive-register-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
