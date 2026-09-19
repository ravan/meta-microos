SUMMARY = "Improved colour support under pdfTeX (legacy stub)"
DESCRIPTION = "The package used to provide macros that emulated the 'colour \
stack' functionality of dvips. The colour stack deals with \
colour manipulations when asynchronous events (like \
page-breaking) occur. At the time the package was written, \
pdfTeX did not (yet) have such a stack, though dvips had had \
one for a long time. This package was an experimental solution \
to the problem, and worked best with pdfeTeX. For current \
releases of pdfTeX (later than version 1.40.0, released in \
2007), this package is not needed, since 'real' colour stacks \
are available. The present pdfcolmk is therefore just an empty \
stub that does nothing at all, just in case there are still \
documents that reference it. The documented source of the \
original package is still available at the github repository."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn52912"

RPM_NAME = "texlive-pdfcolmk-2026.226.2.0svn52912-58.2.noarch.rpm"
RPM_HASH = "0dc9c4285718e0d04651e2c4e1f7b7c62a714cb8303c83b8c53d45a5682545153b678a7e26cdb23299aa0e6eadae1c191f9b6efe4d58db9fda085e187decbea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcolmk.sty \
texlive-pdfcolmk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
