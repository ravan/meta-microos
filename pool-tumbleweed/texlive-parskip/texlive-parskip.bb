SUMMARY = "Layout with zero \\parindent, non-zero \\parskip"
DESCRIPTION = "Simply changing \\parskip and \\parindent leaves a layout that is \
untidy; this package (though it is no substitute for a \
properly-designed class) helps alleviate this untidiness."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0hsvn77682"

RPM_NAME = "texlive-parskip-2026.226.2.0hsvn77682-58.2.noarch.rpm"
RPM_HASH = "9161ccaad24a8e310d92d37f9adf8f4560b8ac733428a789d66be6ae91cd667582f03f3517da03830b7975a83cced8339a5fff901762859de10e9b606d9deac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parskip-2001-04-09.sty \
tex-parskip.sty \
texlive-parskip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
