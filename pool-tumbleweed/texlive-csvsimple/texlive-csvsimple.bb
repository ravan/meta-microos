SUMMARY = "Simple CSV file processing"
DESCRIPTION = "The package provides a simple LaTeX interface for the \
processing of files with comma separated values (CSV); it \
relies on the key value syntax supported by pgfkeys to simplify \
usage. Filtering and table generation are especially supported; \
however, this lightweight tool offers no support for data \
sorting or data base storage. The package depends on etoolbox, \
ifthen, pgfrcs, pgfkeys, and shellesc."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7.0svn77682"

RPM_NAME = "texlive-csvsimple-2026.226.2.7.0svn77682-61.2.noarch.rpm"
RPM_HASH = "4ca7d6cdab514b81606acfd84b525055d9c5f3e07515a1c89685b19f3ff81793f9f85aba672f81b19c799f093e2b2ad922167fabb9189d834a884d23f32f1d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csvsimple-l3.sty \
tex-csvsimple-legacy.sty \
tex-csvsimple.sty \
texlive-csvsimple"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-pgfkeys.sty \
tex-pgfrcs.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
