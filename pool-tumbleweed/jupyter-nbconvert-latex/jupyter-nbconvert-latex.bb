SUMMARY = "LaTeX support for nbconvert"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package pulls in the LaTeX dependencies for nbconvert."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.17.1"

RPM_NAME = "jupyter-nbconvert-latex-7.17.1-2.1.noarch.rpm"
RPM_HASH = "6f1066d72e1c6c27b6d45f3613a872d0672666cdeb38dbb2709752846ac5d04a8d4b4849f7cb327ece62689e474baa24b5cfb71d798af42768b9bc6a79cb22e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert-latex"

RDEPENDS:${PN} += "jupyter-nbconvert \
tex-adjustbox.sty \
tex-eurosym.sty \
tex-ulem.sty \
texlive-bibtex \
texlive-makeindex"

inherit rpm
