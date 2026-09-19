SUMMARY = "A different way to read counters"
DESCRIPTION = "The package offers package or class authors a way to format \
counters with 'patterns'. These patterns do not affect 'normal' \
LaTeX treatment of counters."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn34668"

RPM_NAME = "texlive-cntformats-2026.226.0.0.7svn34668-60.2.noarch.rpm"
RPM_HASH = "a24ee54f1e4605a47840a53fdfd72d201ee33f0a6f866d82900fd4800b04391291ea3f3c6bfc2db57429de42d013dd6c54a11fd9821c50a72c294cb08a949b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cntformats.sty \
texlive-cntformats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cnltx-base.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
