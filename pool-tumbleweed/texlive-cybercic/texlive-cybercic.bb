SUMMARY = "'Controls in Contents' for the cyber package"
DESCRIPTION = "This package is used in concert with the cyber package to make \
documents with annotations of compliance with cybersecurity \
requirements. 'cic' stands for 'Controls in Contents', and when \
you include this package, some notations of compliance are \
added to section names as seen in the table of contents of the \
final document. It also makes your document more brittle in \
unexpected ways: for example, when you use cybercic in the same \
document as hyperref, you cannot use any formatting in your \
section titles. So don't use cybercic unless you need to."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn37659"

RPM_NAME = "texlive-cybercic-2026.226.2.1svn37659-61.2.noarch.rpm"
RPM_HASH = "64c98ae84712c37405a3215ddfaef57719eb0781168b9de40e64e23527f7c4586bc1c5f058456001e2f2e0755f859cb71aa53cff72a8668df6506838c3410ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cybercic.sty \
texlive-cybercic"

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
