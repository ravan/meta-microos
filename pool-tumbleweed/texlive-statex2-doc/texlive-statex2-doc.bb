SUMMARY = "Documentation for texlive-statex2"
DESCRIPTION = "This package includes the documentation for texlive-statex2"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn23961"

RPM_NAME = "texlive-statex2-doc-2026.226.2.1svn23961-64.2.noarch.rpm"
RPM_HASH = "113db7ccd58d49e7cad4db454cb28c24804b3a7b79e2b959262cb0b642bdee78f06b7eacd060c7c3da6c6626fb58bd0cbc1d57a64360b51de4564be50663a0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statex2-doc"

RDEPENDS:${PN} += ""

inherit rpm
