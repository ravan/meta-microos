SUMMARY = "Games typesetting"
DESCRIPTION = "Setups for typesetting various games, including chess."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn76381"

RPM_NAME = "texlive-collection-games-2026.222.svn76381-68.2.noarch.rpm"
RPM_HASH = "549374f4cff4d9b98a755046cf4e85af6014a41a8405fab188b0fe6467503096e19f0068f7a79232e3c6a45804257d4d6aa8c89932d1c60d3b6e553f196a32b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-games \
texlive-collection-games"

RDEPENDS:${PN} += "texlive-bartel-chess-fonts \
texlive-chess \
texlive-chess-problem-diagrams \
texlive-chessboard \
texlive-chessfss \
texlive-chinesechess \
texlive-collection-latex \
texlive-crossword \
texlive-crosswrd \
texlive-customdice \
texlive-egameps \
texlive-eigo \
texlive-gamebook \
texlive-gamebooklib \
texlive-go \
texlive-hanoi \
texlive-havannah \
texlive-hexboard \
texlive-hexgame \
texlive-hmtrump \
texlive-horoscop \
texlive-jeuxcartes \
texlive-jigsaw \
texlive-labyrinth \
texlive-logicpuzzle \
texlive-mahjong \
texlive-mathador \
texlive-maze \
texlive-multi-sudoku \
texlive-musikui \
texlive-nimsticks \
texlive-onedown \
texlive-othello \
texlive-othelloboard \
texlive-pas-crosswords \
texlive-pgf-go \
texlive-playcards \
texlive-psgo \
texlive-quizztex \
texlive-realtranspose \
texlive-reverxii \
texlive-rouequestions \
texlive-rpgicons \
texlive-rubik \
texlive-schwalbe-chess \
texlive-scrabble \
texlive-sgame \
texlive-skak \
texlive-skaknew \
texlive-soup \
texlive-sudoku \
texlive-sudokubundle \
texlive-tangramtikz \
texlive-thematicpuzzle \
texlive-tictactoe \
texlive-tikz-triminos \
texlive-trivialpursuit \
texlive-twoxtwogame \
texlive-wargame \
texlive-weiqi \
texlive-wordle \
texlive-xq \
texlive-xskak"

inherit rpm
