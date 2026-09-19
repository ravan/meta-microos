SUMMARY = "A non-standard Cyrillic input scheme"
DESCRIPTION = "A collection of three LaTeX2e styles intended for typesetting \
Russian and bilingual English-Russian documents, using the lh \
fonts and without the benefit of babel's language-switching \
mechanisms. The packages (lhcyralt and lhcyrwin for use under \
emTeX, and lhcyrkoi for use under teTeX) provide mappings \
between the input encoding and the font encoding (which is \
described as OT1). The way this is done does not match the way \
inputenc would do the job, for output via fontenc to one of the \
T2 series of font encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77838"

RPM_NAME = "texlive-lhcyr-2026.226.svn77838-61.2.noarch.rpm"
RPM_HASH = "ecf2526a76997164bb6596c8228030137022999c8db0c8c0ee012393bc3fd4bf36533dcae5bb0ccb08a2c35c1be0b84218df66577a46e9826d3a7369092eb8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karabas.tex \
tex-kniga.tex \
tex-labx0700.tfm \
tex-labx0900.tfm \
tex-labx1000.tfm \
tex-lacc1000.tfm \
tex-larm0700.tfm \
tex-larm0900.tfm \
tex-larm1000.tfm \
tex-lasl0900.tfm \
tex-lasl1000.tfm \
tex-lass1000.tfm \
tex-lasx1000.tfm \
tex-lati0900.tfm \
tex-lati1000.tfm \
tex-latt0800.tfm \
tex-latt0900.tfm \
tex-latt1000.tfm \
tex-lbbi1440.tfm \
tex-lbbx0500.tfm \
tex-lbbx0700.tfm \
tex-lbbx0800.tfm \
tex-lbbx1000.tfm \
tex-lbbx1440.tfm \
tex-lbcc0800.tfm \
tex-lbcc1000.tfm \
tex-lbrm0500.tfm \
tex-lbrm0600.tfm \
tex-lbrm0700.tfm \
tex-lbrm0800.tfm \
tex-lbrm1000.tfm \
tex-lbti0500.tfm \
tex-lbti0700.tfm \
tex-lbti1000.tfm \
tex-lbtt1000.tfm \
tex-lhcyralt-hyphen.cfg \
tex-lhcyralt-rhyphen.tex \
tex-lhcyralt.sty \
tex-lhcyrkoi-hyphen.cfg \
tex-lhcyrkoi-rhyphen.tex \
tex-lhcyrkoi.sty \
tex-lhcyrwin-hyphen.cfg \
tex-lhcyrwin-rhyphen.tex \
tex-lhcyrwin.sty \
tex-ot1kcdh.fd \
tex-ot1kcfib.fd \
tex-ot1kcfr.fd \
tex-ot1kcr.fd \
tex-ot1kcss.fd \
tex-ot1kctt.fd \
tex-ot1kcvtt.fd \
tex-ot1lhdh.fd \
tex-ot1lhfib.fd \
tex-ot1lhfr.fd \
tex-ot1lhr.fd \
tex-ot1lhss.fd \
tex-ot1lhtt.fd \
tex-ot1lhvtt.fd \
tex-ot1wcdh.fd \
tex-ot1wcfib.fd \
tex-ot1wcfr.fd \
tex-ot1wcr.fd \
tex-ot1wcss.fd \
tex-ot1wctt.fd \
tex-ot1wcvtt.fd \
tex-otchet.tex \
tex-pismo.tex \
tex-rusfonts.tex \
tex-statya.tex \
texlive-lhcyr"

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
