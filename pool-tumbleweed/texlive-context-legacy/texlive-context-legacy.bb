SUMMARY = "The ConTeXt macro package, MkII"
DESCRIPTION = "In TeX Live, ConTeXt MkII is split from current ConTeXt (MkIV \
and newer). We use the ConTeXt repackaging as distributed from \
https://github.com/gucci-on-fleek/context-packaging. See \
https://contextgarden.net and https://pragma-ade.com for \
information about ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78010"

RPM_NAME = "texlive-context-legacy-2026.226.svn78010-61.2.noarch.rpm"
RPM_HASH = "6350b11e5ef180172c3b9e61fcf50be076c7a1d7d6750e09733848cbdc09da568bcdcd2e62f1d224e3c534cabf4c51b33408cf65c201609dd2c82242458ffb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tk--path-tre \
tex-8r-base.map \
tex-bibl-ams.tex \
tex-bibl-apa-de.tex \
tex-bibl-apa-fr.tex \
tex-bibl-apa-it.tex \
tex-bibl-apa.tex \
tex-bibl-aps.tex \
tex-bibl-num-fr.tex \
tex-bibl-num.tex \
tex-bibl-ssa.tex \
tex-cmin.enc \
tex-cmit.enc \
tex-cmitt.enc \
tex-cmrm.enc \
tex-cmsc.enc \
tex-cmtt.enc \
tex-contnav.map \
tex-contnav.tfm \
tex-ec-2004.enc \
tex-ec-base.map \
tex-ec-os-public-lm.map \
tex-m-ch-de.tex \
tex-m-ch-en.tex \
tex-m-ch-nl.tex \
tex-mkiv-base.map \
tex-mkiv-px.map \
tex-mkiv-tx.map \
tex-original-adobe-euro.map \
tex-original-ams-base.map \
tex-original-ams-cmr.map \
tex-original-ams-euler.map \
tex-original-base.map \
tex-original-context-symbol.map \
tex-original-dummy.map \
tex-original-empty.map \
tex-original-micropress-informal.map \
tex-original-public-csr.map \
tex-original-public-lm.map \
tex-original-public-plr.map \
tex-original-public-vnr.map \
tex-original-vogel-symbol.map \
tex-original-wasy.map \
tex-original-youngryu-px.map \
tex-original-youngryu-tx.map \
tex-q-8r.enc \
tex-qx-base.map \
tex-qx-os-public-lm.map \
tex-s-cdr-01.tex \
tex-s-faq-00.tex \
tex-s-faq-01.tex \
tex-s-faq-02.tex \
tex-s-faq-03.tex \
tex-s-pre-00.tex \
tex-s-pre-06.tex \
tex-s-pre-07.tex \
tex-s-pre-08.tex \
tex-s-pre-12.tex \
tex-s-pre-13.tex \
tex-s-pre-16.tex \
tex-s-pre-18.tex \
tex-s-pre-22.tex \
tex-s-pre-23.tex \
tex-s-pre-26.tex \
tex-s-pre-27.tex \
tex-s-pre-50.tex \
tex-s-pre-66.tex \
tex-s-pre-67.tex \
tex-s-pre-93.tex \
tex-s-pre-96.tex \
tex-supp-mis.tex \
tex-supp-mpe.tex \
tex-supp-pdf.tex \
tex-t5-base.map \
tex-t5-os-public-lm.map \
tex-texnansi-base.map \
tex-texnansi-os-public-lm.map \
tex-tlig.map \
tex-type-buy.dat \
tex-type-fsf.dat \
tex-type-ghz.dat \
tex-type-tmf.dat \
texlive-context-legacy"

RDEPENDS:${PN} += "/usr/bin/ruby \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-Cwd \
perl-Data--Dumper \
perl-File--Copy \
perl-File--Find \
perl-FindBin \
perl-Getopt--Long \
perl-Tk \
perl-Tk--DirTree \
perl-Tk--ROText \
perl-Tk--widgets \
perl-base \
perl-lib \
perl-strict \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-updmap.cfg \
texlive \
texlive-amsfonts \
texlive-context \
texlive-context-legacy-bin \
texlive-context-legacy-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm \
texlive-ly1 \
texlive-manfnt-font \
texlive-mflogo-font \
texlive-mptopdf \
texlive-pdftex \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd"

inherit rpm
