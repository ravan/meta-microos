SUMMARY = "Find mismatches of parentheses, braces, (angle) brackets, in texts"
DESCRIPTION = "Mismatches of parentheses, braces, (angle) brackets, especially \
in TeX sources which may be rich in those, may be difficult to \
trace. This little Ruby script helps you by writing your text \
to standard output, after adding a left margin to your text, \
which will normally be almost empty, but will clearly show any \
mismatches."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.45svn76442"

RPM_NAME = "texlive-match_parens-2026.226.1.45svn76442-59.2.noarch.rpm"
RPM_HASH = "b40d4303ce8fe1cf966d4ae6e2372126ff885ed56249c3388ecfc2e22593513b0309c1ab91e9cd7c96fd9539bec828fb3f1ff23c54048fbf2c224e8abf649916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-match-parens"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-match-parens-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
