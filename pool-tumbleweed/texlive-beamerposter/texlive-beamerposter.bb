SUMMARY = "Extend beamer and a0poster for custom sized posters"
DESCRIPTION = "The package enables the user to use beamer style operations on \
a canvas of the sizes provided by a0poster; font scaling is \
available (using packages such as type1cm if necessary). In \
addition, the package allows the user to benefit from the nice \
colour box handling and alignment provided by the beamer class \
(for example, with rounded corners and shadows). Good looking \
posters may be created very rapidly. Features include: scalable \
fonts using the fp and type1cm packages; posters in A-series \
sizes, and custom sizes like double A0 are possible; still \
applicable to custom beamer slides, e.g. 16:9 slides for a \
wide-screen (i.e. 1.78 aspect ratio); orientation may be \
portrait or landscape; a 'debug mode' is provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn77682"

RPM_NAME = "texlive-beamerposter-2026.226.1.13svn77682-61.2.noarch.rpm"
RPM_HASH = "1e86857e10600c7f2c5393bf213c9853ea2bf55349b214dd9cec56793769141a22d53574424676375baf3ee500c8ed90b0e4fabdaed94cbf7c807cbcb886ceef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerposter.sty \
tex-beamerthemeAachen.sty \
tex-beamerthemeI6dv.sty \
tex-beamerthemeI6pd.sty \
tex-beamerthemeI6pd2.sty \
tex-beamerthemeI6td.sty \
tex-beamerthemeZH.sty \
texlive-beamerposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-tangocolors.sty \
tex-type1cm.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
