SUMMARY = "Greek"
DESCRIPTION = "Support for Greek."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn65038"

RPM_NAME = "texlive-collection-langgreek-2026.222.svn65038-68.2.noarch.rpm"
RPM_HASH = "4ff6e6d42244b1aeb9489ff79d8f97f08f3074c8ea130a44830689235583b29504685c87cbf2f7ae1b08f2ef43e30cf39183c318e4cd236ab0082de20088fe5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-greek \
texlive-collection-langgreek"

RDEPENDS:${PN} += "texlive-babel-greek \
texlive-begingreek \
texlive-betababel \
texlive-cbfonts \
texlive-cbfonts-fd \
texlive-collection-basic \
texlive-gfsbaskerville \
texlive-gfsporson \
texlive-greek-fontenc \
texlive-greek-inputenc \
texlive-greekdates \
texlive-greektex \
texlive-greektonoi \
texlive-hyphen-ancientgreek \
texlive-hyphen-greek \
texlive-ibycus-babel \
texlive-ibygrk \
texlive-kerkis \
texlive-levy \
texlive-lgreek \
texlive-lgrmath \
texlive-mkgrkindex \
texlive-talos \
texlive-teubner \
texlive-xgreek \
texlive-yannisgr"

inherit rpm
