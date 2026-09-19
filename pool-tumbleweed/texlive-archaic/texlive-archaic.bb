SUMMARY = "A collection of archaic fonts"
DESCRIPTION = "The collection contains fonts to represent Aramaic, Cypriot, \
Etruscan, Greek of the 6th and 4th centuries BCE, Egyptian \
hieroglyphics, Linear A, Linear B, Nabatean old Persian, the \
Phaistos disc, Phoenician, proto-Semitic, runic, South Arabian \
Ugaritic and Viking scripts. The bundle also includes a small \
font for use in phonetic transcription of the archaic writings. \
The bundle's own directory includes a font installation map \
file for the whole collection."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38005"

RPM_NAME = "texlive-archaic-2026.226.svn38005-61.2.noarch.rpm"
RPM_HASH = "9f84c3a67509934f0f989c2c72b9ef59079c2f425602fc0ead2ae2f2b612faf3b8f22815b8ab761fa63a8c19120bd90240cf8f754f024928a2ad980bab8c758a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aram10.tfm \
tex-aramaic.map \
tex-aramaic.sty \
tex-archaicprw.map \
tex-copsn10.tfm \
tex-cugar10.tfm \
tex-cypr10.tfm \
tex-cypriot.map \
tex-cypriot.sty \
tex-etr10.tfm \
tex-etruscan.map \
tex-etruscan.sty \
tex-fut10.map \
tex-fut10.tfm \
tex-givbc10.tfm \
tex-greek4cbc.map \
tex-greek4cbc.sty \
tex-greek6cbc.map \
tex-greek6cbc.sty \
tex-gvibc10.tfm \
tex-hieroglf.map \
tex-hieroglf.sty \
tex-linb10.tfm \
tex-linearb.map \
tex-linearb.sty \
tex-nab10.tfm \
tex-nabatean.map \
tex-nabatean.sty \
tex-oands.map \
tex-oands.sty \
tex-oandsi10.tfm \
tex-oandsu10.tfm \
tex-oldprsn.map \
tex-oldprsn.sty \
tex-ot1aram.fd \
tex-ot1copsn.fd \
tex-ot1cugar.fd \
tex-ot1cypr.fd \
tex-ot1etr.fd \
tex-ot1fut.fd \
tex-ot1givbc.fd \
tex-ot1gvibc.fd \
tex-ot1nab.fd \
tex-ot1oands.fd \
tex-ot1phnc.fd \
tex-ot1pmhg.fd \
tex-ot1proto.fd \
tex-ot1sarab.fd \
tex-ot1vik.fd \
tex-phnc10.tfm \
tex-phoenician.map \
tex-phoenician.sty \
tex-pmhg.tfm \
tex-proto10.tfm \
tex-protosem.map \
tex-protosem.sty \
tex-runic.sty \
tex-sarab10.tfm \
tex-sarabian.map \
tex-sarabian.sty \
tex-t1aram.fd \
tex-t1copsn.fd \
tex-t1cugar.fd \
tex-t1cypr.fd \
tex-t1etr.fd \
tex-t1fut.fd \
tex-t1givbc.fd \
tex-t1gvibc.fd \
tex-t1linb.fd \
tex-t1nab.fd \
tex-t1oands.fd \
tex-t1phnc.fd \
tex-t1pmhg.fd \
tex-t1proto.fd \
tex-t1sarab.fd \
tex-t1vik.fd \
tex-ugarite.map \
tex-ugarite.sty \
tex-vik10.tfm \
tex-viking.sty \
texlive-archaic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-archaic-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
