SUMMARY = "Verbatim with URL-sensitive line breaks"
DESCRIPTION = "The command \\url is a form of verbatim command that allows \
linebreaks at certain characters or combinations of characters, \
accepts reconfiguration, and can usually be used in the \
argument to another command. (The \\urldef command provides \
robust commands that serve in cases when \\url doesn't work in \
an argument.) The command is intended for email addresses, \
hypertext links, directories/paths, etc., which normally have \
no spaces, so by default the package ignores spaces in its \
argument. However, a package option 'allows spaces', which is \
useful for operating systems where spaces are a common part of \
file names."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn77682"

RPM_NAME = "texlive-url-2026.226.3.4svn77682-60.2.noarch.rpm"
RPM_HASH = "f99116a3f2d9009c38a086dd180c601b0d93ecbd6ee6401071b9736a4697bf16e98ae1bdd47a8aff95da3dd2b0c63b6d901586531097fc7b7e32ae7129c0e6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-url.sty \
texlive-url"

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
