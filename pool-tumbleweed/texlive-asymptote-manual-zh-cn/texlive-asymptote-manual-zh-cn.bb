SUMMARY = "A Chinese translation of the asymptote manual"
DESCRIPTION = "This is an (incomplete, simplified) Chinese translation of the \
Asymptote manual."
LICENSE = "LGPL-3.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-asymptote-manual-zh-cn-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "bbbe6c6f877cd38309b5439d62f9311948d19001d816fe3cf5038a008ad2452371548c085ac947f1914681760e714c647f7bc6c138ef6dbb9b8fc1f9592b950a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-manual-zh-cn"

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
