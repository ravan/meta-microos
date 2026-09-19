SUMMARY = "DocBook to LaTeX Publishing - Documentation"
DESCRIPTION = "dblatex is a program that transforms your SGML/XMLDocBook documents to DVI, \
PostScript or PDF by translating them into pure LaTeX as a first process. \
MathML 2.0 markups are supported, too. It started as a clone of DB2LaTeX."
LICENSE = "GPL-2.0-only"

PV = "0.3.12"

RPM_NAME = "dblatex-doc-0.3.12-2.6.noarch.rpm"
RPM_HASH = "5a6420c6342cdd31d0c4f633eefb7d0f0c12e35b52c4582a29b45ef8ef8a0cf146d06449f92d4b6f1dc735ab20738fb094166c213d97c75d89c5ce41f7769544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dblatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
