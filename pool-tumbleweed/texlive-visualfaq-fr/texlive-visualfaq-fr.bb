SUMMARY = "FAQ LaTeX visuelle francophone"
DESCRIPTION = "(French version below.) The Visual LaTeX FAQ is an innovative \
new search interface on LaTeX Frequently Asked Questions. This \
version is a French translation, offering links to the \
French-speaking LaTeX FAQ. Vous avez du mal a trouver la \
reponse a une question sur LaTeX ou meme a trouver les mots \
pour exprimer votre question? La FAQ LaTeX visuelle est une \
interface de recherche innovante qui presente plus d'une \
centaine d'exemples de mises en forme de documents frequemment \
demandees. Il suffit de cliquer sur l'hyperlien qui correspond \
a ce que vous souhaitez faire - ou ne pas faire - et la FAQ \
LaTeX visuelle enverra votre navigateur web a la page \
correspondante de la FAQ LaTeX francophone."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71053"

RPM_NAME = "texlive-visualfaq-fr-2026.226.svn71053-60.2.noarch.rpm"
RPM_HASH = "bd98544de615d66260b43c9a5257a190bb250fd4eaf307ca234f89240d4a1b82aff338d982db6a56330202ff558b72e36b564f6b462e6375f3a746a24861c518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualfaq-fr"

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
