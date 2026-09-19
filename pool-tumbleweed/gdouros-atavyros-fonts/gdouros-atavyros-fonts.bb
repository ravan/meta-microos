SUMMARY = "Parangonne Greque Typeface"
DESCRIPTION = "Robert Granjon (1513 – 1589) produced his Parangonne Greque typeface (Garmond size) at the instigation of Plantin as a counterpart to Garamond’s Grec du roi, in Antwerp Holland, between 1560 - 1565. A version of the font was used (a century later!) for the 1692 edition of Diogenes Laertius by Aegidius Menagius (Gilles Ménage of Angers, 1613 – 92), published by Henric Wetstenium in Amsterdam. A second variant, at Kolonel size, was cut by Nikolaas Kis for the Greek-Dutch edition of the New Testament in 1698, again by Henric Wetstenium. A digital revival, was prepared by Ralph P. Hancock, in his Vusillus font. Latin and Cyrillic are based on a Goudy typeface. The font covers the Windows Glyph List, Greek Extended, various typographic extras and some Open Type features (Numerators, Denominators, Fractions, Old Style Figures, Historical Forms, Stylistic Alternates, Ligatures)."
LICENSE = "SUSE-Permissive"

PV = "1.01"

RPM_NAME = "gdouros-atavyros-fonts-1.01-3.29.noarch.rpm"
RPM_HASH = "4d3173faee5d0baedf570bdce24a349f4f32118a0b45a54d1b4e2c9c96493494327a4f2805f276e251f83c56bf78eeec99a6091a467130e4032eb6e06d78a48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atavyros-fonts \
gdouros-atavyros-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
