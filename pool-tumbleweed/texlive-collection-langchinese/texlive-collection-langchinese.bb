SUMMARY = "Chinese"
DESCRIPTION = "Support for Chinese; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77432"

RPM_NAME = "texlive-collection-langchinese-2026.222.svn77432-68.2.noarch.rpm"
RPM_HASH = "739e00cd7f1640149927aa9fab33403c9f56b4c5d5c4b4c48508834af88edf5339c4876cb7a947c8a5944370e805bf98c2c97acf72154173ef92106fcfbea770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-chinese \
texlive-collection-langchinese"

RDEPENDS:${PN} += "texlive-arphic \
texlive-arphic-ttf \
texlive-asymptote-by-example-zh-cn \
texlive-asymptote-faq-zh-cn \
texlive-asymptote-manual-zh-cn \
texlive-cns \
texlive-collection-langcjk \
texlive-ctex \
texlive-ctex-faq \
texlive-exam-zh \
texlive-fandol \
texlive-fduthesis \
texlive-hanzibox \
texlive-hyphen-chinese \
texlive-impatient-cn \
texlive-install-latex-guide-zh-cn \
texlive-latex-notes-zh-cn \
texlive-lshort-chinese \
texlive-luatex-cn \
texlive-lxgw-fonts \
texlive-nanicolle \
texlive-njurepo \
texlive-pgfornament-han \
texlive-qyxf-book \
texlive-sjtutex \
texlive-suanpan-l3 \
texlive-texlive-zh-cn \
texlive-texproposal \
texlive-tlmgr-intro-zh-cn \
texlive-upzhkinsoku \
texlive-xpinyin \
texlive-xtuthesis \
texlive-zhlineskip \
texlive-zhlipsum \
texlive-zhmetrics \
texlive-zhmetrics-uptex \
texlive-zhnumber \
texlive-zhspacing"

inherit rpm
