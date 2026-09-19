SUMMARY = "Convenient inline commenting in collaborative documents"
DESCRIPTION = "Easily define helper macros to insert comments in a LaTeX \
document. A convenient syntax enables you to mark text \
additions (e.g., '... \\phf{I'm adding this text} ...' or '... \
\\phf I'm adding this text\\endphf ...'), an in-line comment \
(e.g., '... We're the best \\phf[I'm not sure about this.] \
...'), and text removals (e.g., '... \\phf*{remove me} ...'). \
New colors are assigned automatically to each commenter by \
default, and the appearance of all comments is highly \
customizable."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn60731"

RPM_NAME = "texlive-phfcc-2026.226.2.0svn60731-58.2.noarch.rpm"
RPM_HASH = "f1205f29ce7199f9fcc3504127307c2bd5d5045aa2f2f3f3cdb52afcf94407cbb139b77d4827b914661dcbcb49711973ba52191d8db6ae3987e59ccdd5feb020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfcc.sty \
texlive-phfcc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-lua-ul.sty \
tex-marginnote.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
