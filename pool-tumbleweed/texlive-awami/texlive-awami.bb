SUMMARY = "A collection of Awami Nastaliq fonts"
DESCRIPTION = "Awami Nastaliq is a Nastaliq-style Arabic script font \
supporting a wide variety of languages of southwest Asia, \
including but not limited to Urdu. This font is aimed at \
minority language support. This makes it unique among Nastaliq \
fonts. The font is also a Graphite-only font. It does not \
support OpenType rendering."
LICENSE = "OFL-1.1"

PV = "2026.226.3.400svn76980"

RPM_NAME = "texlive-awami-2026.226.3.400svn76980-60.2.noarch.rpm"
RPM_HASH = "e36e7325e5061159ae887d472b9a900a6866f5a0a4a756029cd8e8193cd38057260e81adcc7cc5c85db4442419833f5f76c625792b7478ca2aa45abe93456034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-awami"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-awami-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
