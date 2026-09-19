SUMMARY = "A (primitive) token list editor"
DESCRIPTION = "Just like sed is a stream editor, ted is a token list editor. \
Actually, it is not as powerful as sed, but its main feature is \
that it really works with tokens, not only characters. The ted \
package provides two user macros: \\Substitute and \\ShowTokens. \
The first is maybe the most useful: it performs substitutions \
in token lists (even inside braces). The second displays each \
token of the list (one per line) with its catcode (in the list, \
not just the current one), and can be useful for debugging or \
for TeX learners. Ted is designed to work well even if strange \
tokens (that is, unusual {charcode, catcode} pairs or tokens \
with a confusing meaning) occur in the list."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.06svn76924"

RPM_NAME = "texlive-ted-2026.227.1.06svn76924-62.2.noarch.rpm"
RPM_HASH = "d7643cc8c08635e919d954bf635679cf8bb56788488fbe9f7fe0135e214b15da6aaaea0d45fb28825e286ed3a5add166346ee0e4943d4139e635276a59c2f04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ted.sty \
texlive-ted"

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
