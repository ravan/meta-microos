SUMMARY = "Typeset KIX codes"
DESCRIPTION = "Implements KIX codes as used by the Dutch PTT for bulk mail \
addressing. (Royal Mail 4 State Code.) KIX is a registered \
trade mark of PTT Post Holdings B. V."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21606"

RPM_NAME = "texlive-kix-2026.226.svn21606-63.2.noarch.rpm"
RPM_HASH = "ed5f23885383a4caec24a46ce364628be3e8458ba7164e7d1d9d6f1fd9e6033fde9a14232a2c793b3fc7004bcc0b1e9d0b86cf7abcaec5f4b28b85ad3f66dac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kix.sty \
texlive-kix"

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
