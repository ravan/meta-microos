SUMMARY = "Font for Conan Doyle's 'The Dancing Men'"
DESCRIPTION = "The (Sherlock Holmes) book contains a code which uses dancing \
men as glyphs. The alphabet as given is not complete, lacking \
f, j, k, q, u, w, x and z, so those letters in the font are not \
due to Conan Doyle. The code required word endings to be marked \
by the dancing man representing the last letter to be holding a \
flag: these are coded as A-Z. \
thaTiStOsaYsentenceSiNthEcodElooKlikEthiS. In some cases, the \
man has no arms, making it impossible for him to hold a flag. \
In these cases, he is wearing a flag on his hat in the \
'character'. The font is distributed as Metafont source; it \
works poorly in modern environments, and could do with expert \
attention (if you are interested, please contact the CTAN team \
for details)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn13293"

RPM_NAME = "texlive-dancers-2026.226.svn13293-61.2.noarch.rpm"
RPM_HASH = "23120c1098bbbe9ff63c59a90f9af347b6c2e691f5a71987229f493dc371b75d56de074382fce59b8a41474bf68f77046fc85f894d9576c4ce0d6281ef9055e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dancers.tfm \
texlive-dancers"

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
