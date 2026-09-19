SUMMARY = "Documentation for texlive-cc-pl"
DESCRIPTION = "This package includes the documentation for texlive-cc-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-doc-2026.226.1.02.3svn58602-59.2.noarch.rpm"
RPM_HASH = "8f72d1ba8fe41e2df9597b0399725d11a6d0b0daf59916241c452a2ea06eb26f70cd8caa972b244a97acac88c70fad4da83495ba180afe341849e89533d6ecad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cc-pl-doc"

RDEPENDS:${PN} += ""

inherit rpm
