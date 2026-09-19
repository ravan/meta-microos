SUMMARY = "A tool for creating document structures based on templates"
DESCRIPTION = "TeXplate is a tool for creating document structures based on \
templates. The application name is a word play on TeX and \
template, so the purpose seems quite obvious: we want to \
provide an easy and straightforward framework for reducing the \
typical code boilerplate when writing TeX documents. Also note \
that one can easily extrapolate the use beyond articles and \
theses: the application is powerful enough to generate any \
text-based structure, given that a corresponding template \
exists."
LICENSE = "BSD-3-Clause"

PV = "2026.227.1.0.6svn71963"

RPM_NAME = "texlive-texplate-2026.227.1.0.6svn71963-62.2.noarch.rpm"
RPM_HASH = "bc25786fcb5fea579cbca4ccba773461f9ab90083ca0d8a3db85190fb2f00a45532ee4849ad91df573f16b180ff55eaeb60aaf70ffdb7fe9c7ee207f4518b58a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texplate.jar \
texlive-texplate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texplate-bin"

inherit rpm
