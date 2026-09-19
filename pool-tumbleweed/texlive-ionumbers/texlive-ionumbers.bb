SUMMARY = "Restyle numbers in maths mode"
DESCRIPTION = "'ionumbers' stands for 'input/output numbers'. The package \
restyles numbers in maths mode. If a number in the input file \
is written, e.g., as $3,231.44$ as commonly used in English \
texts, the package is able to restyle it to be output as \
$3\\,231{,}44$ as commonly used in German texts (and vice \
versa). This may be useful, for example, if you have a large \
table and want to include it in texts with different output \
conventions without the need to change the table. The package \
can also automatically group digits left of the decimal \
separator (thousands) and right of the decimal separator \
(thousandths) in triplets without the need of specifying commas \
(English) or points (German) as separators. E.g., the input \
$1234.567890$ can be output as $1\\,234.\\,567\\,890$. Finally, an \
e starts the exponent of the number. For example, $21e6$ may be \
output as $26\\times10\\,^{6}$."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3.3svn76924"

RPM_NAME = "texlive-ionumbers-2026.226.0.0.3.3svn76924-63.2.noarch.rpm"
RPM_HASH = "f3516f4860dd0583189712712c9a9a92e0926c13d9ddf0aac234037b6010a5199879cbf55b98a4d7579ecc57329f0d8103e8197d2c74cf9984a4be835b00e4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ionumbers.sty \
texlive-ionumbers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
