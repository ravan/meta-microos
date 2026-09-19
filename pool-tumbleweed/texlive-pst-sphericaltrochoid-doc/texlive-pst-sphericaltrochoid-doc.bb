SUMMARY = "Documentation for texlive-pst-sphericaltrochoid"
DESCRIPTION = "This package includes the documentation for texlive-pst-sphericaltrochoid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77173"

RPM_NAME = "texlive-pst-sphericaltrochoid-doc-2026.226.0.0.01svn77173-60.4.noarch.rpm"
RPM_HASH = "be28ecbb66bf36323f6c3b62127e00758799d7425b6fc45ce27d428d086c39b41a3f3391a2b1eafedcb14877b88a3b6cda44715aff77fc21641f76c3554f49ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-sphericaltrochoid-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
