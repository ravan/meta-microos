SUMMARY = "A new interface for environments in LaTeX"
DESCRIPTION = "The package provides the \\collect@body command (as in amsmath), \
as well as a \\long version \\Collect@Body, for collecting the \
body text of an environment. These commands are used to define \
a new author interface to creating new environments. For \
example, \\NewEnviron{test}, wraps the entire environment body \
in square brackets, doing the right thing in ignoring leading \
and trailing spaces."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-environ-2026.226.0.0.3svn77682-61.4.noarch.rpm"
RPM_HASH = "f993e4e8606004d21a2a010600116c93bef5f17237b6a5e07c644392dcf75e4f81c721fa54469d2eacfe0b7a7cb6577f5fa1b40620f3307741c79ef4c20138f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-environ.sty \
texlive-environ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-trimspaces"

inherit rpm
