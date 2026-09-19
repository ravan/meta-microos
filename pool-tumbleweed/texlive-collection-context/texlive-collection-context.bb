SUMMARY = "ConTeXt and packages"
DESCRIPTION = "Hans Hagen's powerful ConTeXt system, https://pragma-ade.com. \
Also includes third-party ConTeXt packages. TeX Live uses the \
ConTeXt repackaging as distributed from \
https://github.com/gucci-on-fleek/context-packaging. See \
https://contextgarden.net and https://pragma-ade.com for \
information about ConTeXt.#"
LICENSE = "LPPL-1.0"

PV = "2026.222.svn75426"

RPM_NAME = "texlive-collection-context-2026.222.svn75426-68.2.noarch.rpm"
RPM_HASH = "d394ac393f1986aec301ffca93a7150b8bfd787d36dd3fa18008da7bc8db70385be1446a54af8a449be28fef53e27e826825afaebb6fc96ce9a1e8dce21f3b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-context \
texlive-collection-context"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-context \
texlive-context-animation \
texlive-context-calendar-examples \
texlive-context-chat \
texlive-context-collating-marks \
texlive-context-cyrillicnumbers \
texlive-context-filter \
texlive-context-gnuplot \
texlive-context-handlecsv \
texlive-context-legacy \
texlive-context-letter \
texlive-context-mathsets \
texlive-context-notes-zh-cn \
texlive-context-pocketdiary \
texlive-context-simpleslides \
texlive-context-squares \
texlive-context-sudoku \
texlive-context-transliterator \
texlive-context-typescripts \
texlive-context-vim \
texlive-context-visualcounter \
texlive-jmn \
texlive-luajittex"

inherit rpm
