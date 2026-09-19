SUMMARY = "Expandable operations for tuples of numbers"
DESCRIPTION = "This package provides expandable operations for tuples of \
numbers: len, sum, min, max, mean, med, quantile, standard \
deviation, get item, position of item sort, add or set(*) \
items, filter, operations, composition(*), split(*), formatting \
and display All with a concise syntax that is easy and \
intuitive to use : object.method1.method2... (*): unexpandable \
method \
--------------------------------------------------------------- \
-------- Cette extension met a disposition des operations \
developpables pour les tuples de nombres : len, sum, min, max, \
mean, med, quantile, ecart type, get item, position d'un \
element tri, ajout ou modification(*) d'elements, filtre, \
operations, composition(*), coupure(*), formattage et affichage \
Le tout avec une syntaxe concise et d'un usage facile et \
intuitif : object.methode1.methode2... (*) : methode non \
developpable"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn78219"

RPM_NAME = "texlive-tuple-2026.226.0.0.2svn78219-59.2.noarch.rpm"
RPM_HASH = "25306f753c8a6022330c421a8407f8943c5e12efad3b1b69124dd062e4d9c1ac2aaee77a7fcc6a4dd1eaaea5b8b23956303233b0539df496d7c799f88192709e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tuple.sty \
tex-tuple.tex \
texlive-tuple"

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
