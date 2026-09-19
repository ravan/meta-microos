SUMMARY = "BibTeX variant supporting 8-bit encodings"
DESCRIPTION = "An enhanced, portable C version of BibTeX. Enhanced by \
conversion to larger (32-bit) capacity, addition of run-time \
selectable capacity and 8-bit support extensions. National \
character set and sorting order are controlled by an external \
configuration file. Various examples are included. Originally \
written by Niel Kempson and Alejandro Aguilar-Sierra, it is now \
maintained as part of TeX Live."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-bibtex8-2026.226.svn75712-61.2.noarch.rpm"
RPM_HASH = "88f4024be7db7bc6bc513d5a5282bae3a71c83738e21cefda22de6359d686ea188cdf39bde26b172d1cac25bb796f2d1dc0735afdad78df0cf0b5a2060a54289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtex8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibtex8-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
