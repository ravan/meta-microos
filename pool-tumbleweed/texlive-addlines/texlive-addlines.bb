SUMMARY = "A user-friendly wrapper around \\enlargethispage"
DESCRIPTION = "This small package provides the command \\addlines for adding or \
removing space in the textblock of the page it's used on. E.g., \
adding an extra line of text to the page so that a section fits \
better on the next page. It will also add space to the facing \
page in a two-sided document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-addlines-2026.226.0.0.3svn77682-61.2.noarch.rpm"
RPM_HASH = "ba8584d1744f798034a784ba2260c0f9b3e0161f8eb00943ebcb6fb3cdcf7918e141add1fd0cda411fea9c86619b4d51bd448a4057f58bd3c59d79e1fa112120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addlines.sty \
texlive-addlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-changepage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
