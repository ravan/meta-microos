SUMMARY = "A rich set of tools for editing LaTeX"
DESCRIPTION = "Vim-LaTeX (aka LaTeX-suite) is a mature project which aims at bringing \
together the rich set of LaTeX tools the vim community has produced over \
the years into one comprehensive package. It provides a set of tools \
which enable you to do all your LaTeX-ing without needing to quit Vim."
LICENSE = "Vim"

PV = "1.10.0+20250111"

RPM_NAME = "vim-plugin-latex-1.10.0+20250111-64.2.noarch.rpm"
RPM_HASH = "e8ea3f54748d7223e8eee82d4401b6a490ff1f9b9dab5c69c47feea765bc18d84e4f5c26d20295736ca88dded20b24238e86159607b0b81431e516be7aa399b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-latex"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
texlive-latex \
vim"

inherit rpm
