SUMMARY = "A package for typesetting isotopes"
DESCRIPTION = "The package provides a command \\isotope for setting the atomic \
weight and atomic number indications of isotopes. (The naive \
way of doing the job with (La)TeX mathematics commands produces \
an unsatisfactory result.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn23711"

RPM_NAME = "texlive-isotope-2026.226.0.0.3svn23711-63.2.noarch.rpm"
RPM_HASH = "a41943b542d4c0560fd13d3f8a0a953687c544830472c3b5396b307f4b67a5c5647a5ecf5e0629ba7d3fd2296f3754484deffb839c691d66e59604f2f6e82d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isotope.sty \
texlive-isotope"

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
