SUMMARY = "Sources of the GUTenberg French LaTeX FAQ and PDF files"
DESCRIPTION = " \
Questions (French version below) This package contains the \
sources of the GUTenberg French LaTeX FAQ (French (La)TeX users \
group), currently maintained as an Git repository open to all: \
https://gitlab.gutenberg-asso.fr If you'd like to read the FAQ, \
please visit the URL above. This package also contains two PDF \
versions of this FAQ: faqlatexgutenberg.pdf with code verbatim \
in clear mode faqlatexgutenberg-sombre.pdf with code verbatim \
in dark mode ## Participate You can also open an account on the \
association's Gitlab forge: https://gitlab.gutenberg-asso.fr \
and ask to join the repository \
https://gitlab.gutenberg-asso.fr/gutenberg/faq-gut All \
contributions are welcome: corrections of small errors, \
updating answers to questions, or adding new questions! These \
files are made available on CTAN only to encourage reuse of \
this content, and to preserve a permanent copy. ## Contact us \
For questions and comments: faq@gutenberg-asso.fr ## Version \
2024-10-07 # FAQ LaTeX francophone GUTenberg -- Foire aux \
Questions Ce package contient les sources de la FAQ LaTeX \
francophone GUTenberg (groupe des utilisateurs francophones de \
(La)TeX), actuellement maintenue a jour sous forme d'un depot \
Git ouvert a tous: https://gitlab.gutenberg-asso.fr Si vous \
souhaitez lire la FAQ, nous vous conseillons de consulter l'URL \
ci-dessus. Ce package contient aussi deux versions PDF de cette \
FAQ: faqlatexgutenberg.pdf avec verbatim des codes en mode \
clair faqlatexgutenberg-sombre.pdf avec verbatim des codes en \
mode sombre ## Participer Vous pouvez egalement ouvrir un \
compte sur la forge Gitlab de l'association GUTenberg: \
https://gitlab.gutenberg-asso.fr et demander a rejoindre le \
depot: https://gitlab.gutenberg-asso.fr/gutenberg/faq-gut \
Toutes les contributions sont les bienvenues: corrections des \
petites erreurs, mises a jour des reponses aux questions, ou \
ajout de nouvelles questions ! Ces fichiers ne sont mis a \
disposition sur le CTAN que pour encourager la reutilisation de \
ce contenu, et pour en conserver une copie perenne. ## Nous \
contacter Pour toutes questions et remarques: \
faq@gutenberg-asso.fr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75712"

RPM_NAME = "texlive-faq-fr-gutenberg-2026.226.svn75712-59.2.noarch.rpm"
RPM_HASH = "3186072ba21393b32c43e4e820768b9825b48cfa8528f13d8cb505c95e5e6f0ae318b6059962db9ecec3db98668b9d2e78df3e0acae02d2018d4f03b182e0ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-faq-fr-gutenberg"

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
