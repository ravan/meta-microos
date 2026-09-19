SUMMARY = "The ConTeXt macro package"
DESCRIPTION = "A full featured, parameter driven macro package, which fully \
supports advanced interactive documents. See the ConTeXt Wiki \
for more information. This content on CTAN is packaged \
independently of the ConTeXt project, so if you have a problem \
with ConTeXt itself, it is best to report it to the official \
ntg-context@ntg.nl mailing list. If you notice that ConTeXt is \
mispackaged in TeX Live or CTAN, then please open a new issue \
on GitHub, email the public ntg-context@ntg.nl or \
tex-live@tug.org mailing lists, or email me privately at \
tex@maxchernoff.ca. Pull requests are also gladly accepted."
LICENSE = "LPPL-1.0"

PV = "2026.226.20260219_11_49_asvn78010"

RPM_NAME = "texlive-context-2026.226.20260219_11_49_asvn78010-61.2.noarch.rpm"
RPM_HASH = "d484486c096a786dc499bc685b52495f02e40abce37af7fa3d7058c594a8ce414707dd03cc3ef21b9e40713b1d5f2317fc54bd9108db2f5b9dbca05073a511fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-context \
tex-aesop-de.tex \
tex-alfredsson-sv.tex \
tex-aristotle-grc.tex \
tex-bidi-symbols.tex \
tex-bryson.tex \
tex-capek-cs.tex \
tex-capek-vlnka-cs.tex \
tex-carey.tex \
tex-carrol.tex \
tex-cervantes-es.tex \
tex-context-lmtx-error.tex \
tex-context-performance.tex \
tex-context-test.tex \
tex-context-todo.tex \
tex-darwin.tex \
tex-davis.tex \
tex-dawkins.tex \
tex-demo-mps.tex \
tex-demo-symbols.tex \
tex-demo-tex.tex \
tex-demo-xml.tex \
tex-dequincey.tex \
tex-dijkstra.tex \
tex-douglas.tex \
tex-dyrynk-cs.tex \
tex-dyrynk-vlnka-cs.tex \
tex-export-example.tex \
tex-falstaff-sv.tex \
tex-gabriel.tex \
tex-gray.tex \
tex-greenfield.tex \
tex-hawking.tex \
tex-herbert-en.tex \
tex-herbert-es.tex \
tex-hviezdoslav-sk.tex \
tex-hviezdoslav-vlnka-sk.tex \
tex-i-readme.tex \
tex-jaros-sk.tex \
tex-jaros-vlnka-sk.tex \
tex-jaynes.tex \
tex-jojomayer.tex \
tex-khatt-ar.tex \
tex-khatt-en.tex \
tex-klein.tex \
tex-knuth-gpt.tex \
tex-knuth.tex \
tex-knuthmath.tex \
tex-kollar-cs.tex \
tex-kollar-vlnka-cs.tex \
tex-komensky-cs.tex \
tex-komensky-vlnka-cs.tex \
tex-krdel-sk.tex \
tex-kun-cs.tex \
tex-lansburgh-letterspacing-sv.tex \
tex-linden.tex \
tex-lorem.tex \
tex-luatex-basics-prepare.tex \
tex-luatex-basics.tex \
tex-luatex-core.tex \
tex-luatex-fonts.tex \
tex-luatex-gadgets.tex \
tex-luatex-languages.tex \
tex-luatex-math.tex \
tex-luatex-mplib.tex \
tex-luatex-pdf.tex \
tex-luatex-plain.tex \
tex-luatex-preprocessor-test.tex \
tex-luatex-preprocessor.tex \
tex-luatex-swiglib-test.tex \
tex-luatex-swiglib.tex \
tex-luatex-test.tex \
tex-m-tikz-pgfplots.tex \
tex-m-tikz-pgfplotstable.tex \
tex-materie.tex \
tex-math-knuth-dt.tex \
tex-math-kontinuitet-sv.tex \
tex-mcnish.tex \
tex-montgomery.tex \
tex-mtx-context-arrange.tex \
tex-mtx-context-combine.tex \
tex-mtx-context-common.tex \
tex-mtx-context-compare.tex \
tex-mtx-context-copy.tex \
tex-mtx-context-domotica.tex \
tex-mtx-context-fixpdf.tex \
tex-mtx-context-fonts.tex \
tex-mtx-context-hashed.tex \
tex-mtx-context-ideas.tex \
tex-mtx-context-listing.tex \
tex-mtx-context-meaning.tex \
tex-mtx-context-module.tex \
tex-mtx-context-precache.tex \
tex-mtx-context-select.tex \
tex-mtx-context-setters.tex \
tex-mtx-context-setups.tex \
tex-mtx-context-sql.tex \
tex-mtx-context-timing.tex \
tex-mtx-context-trim.tex \
tex-mtx-context-xml.tex \
tex-poe.tex \
tex-pope-en.tex \
tex-pope-es.tex \
tex-quevedo-es.tex \
tex-reich.tex \
tex-s-abbreviations-extras.tex \
tex-s-abbreviations-logos.tex \
tex-sample.tex \
tex-samples.tex \
tex-sapolsky.tex \
tex-shakespeare-en.tex \
tex-shakespeare-es.tex \
tex-shelley-en.tex \
tex-shelley-es.tex \
tex-shelley-fr.tex \
tex-slova-sk.tex \
tex-smrek-sk.tex \
tex-smrek-vlnka-sk.tex \
tex-stork.tex \
tex-tchaikovsky.tex \
tex-thuan.tex \
tex-tufte.tex \
tex-vallejo-trilce-es.tex \
tex-waltham.tex \
tex-ward.tex \
tex-weisman.tex \
tex-welcome-to-context.tex \
tex-zapf.tex \
tex-zelensky.tex \
texlive-context"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context-bin \
texlive-context-fonts \
texlive-dejavu \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm \
texlive-lm-math \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
