SUMMARY = "Expand private macros in a document"
DESCRIPTION = "De-macro is a Python script that helps authors who like to use \
private LaTeX macros (for example, as abbreviations). A \
technical editor or a cooperating author may balk at such a \
manuscript; you can avoid manuscript rejection misery by \
running de-macro on it. De-macro will expand macros defined in \
\\(re)newcommand or \\(re)newenvironment commands, within the \
document, or in the document's 'private' package file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.1svn66746"

RPM_NAME = "texlive-de-macro-2026.226.1.4.1svn66746-59.2.noarch.rpm"
RPM_HASH = "3c4d2ae01e85c4660118bbae6c6d513afd48c4283a83dc7561965361dd4430cfe1e99343877d3495452e36040d2c0e8a55636c6d3f79a88741700f24555dd2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-de-macro"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-de-macro-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
