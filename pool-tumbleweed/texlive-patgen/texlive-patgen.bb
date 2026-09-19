SUMMARY = "Generate hyphenation patterns"
DESCRIPTION = "Patgen takes a list of hyphenated words and generates a set of \
patterns that can be used by the TeX 82 hyphenation algorithm. \
Patgen was originally written by Frank M. Liang as part of his \
Stanford Ph.D. work, and has always been distributed alongside \
the other programs coming from the Stanford TeX project. It was \
updated in 1991 by Peter Breitenlohner for the new 8-bit \
features of TeX version 3. (These updates related to \
input/output and programming overhead; the actual pattern \
generation algorithms were not changed.) Patgen is currently \
maintained as part of TeX Live."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.4svn77830"

RPM_NAME = "texlive-patgen-2026.226.2.4svn77830-58.2.noarch.rpm"
RPM_HASH = "a0774180bcdd4396da2b25e09a2251e652a3d0dd9992457b01705c63a32bb2d25cf15a04529ca6e742baabd4950e52c14b18ec7b31a8a3e389068bba24407ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-patgen.1 \
texlive-patgen"

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
texlive-patgen-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
