SUMMARY = "Arabic"
DESCRIPTION = "Support for Arabic and Persian."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn78033"

RPM_NAME = "texlive-collection-langarabic-2026.222.svn78033-68.2.noarch.rpm"
RPM_HASH = "6eda6994bd2cfb859a05505eb8e97556c9a8ee5c526262419e582162bf54a89b5da1fd057a07c9990b440738d9837aab82429abeeec938ee311c0424f5348205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-arabic \
texlive-collection-langarabic"

RDEPENDS:${PN} += "texlive-alkalami \
texlive-alpha-persian \
texlive-amiri \
texlive-arabi \
texlive-arabi-add \
texlive-arabic-book \
texlive-arabluatex \
texlive-arabtex \
texlive-awami \
texlive-bidi \
texlive-bidihl \
texlive-collection-basic \
texlive-dad \
texlive-fariscovernew \
texlive-ghab \
texlive-hvarabic \
texlive-hyphen-arabic \
texlive-hyphen-farsi \
texlive-imsproc \
texlive-iran-bibtex \
texlive-khatalmaqala \
texlive-kurdishlipsum \
texlive-lshort-persian \
texlive-luabidi \
texlive-mohe-book \
texlive-na-box \
texlive-parsimatn \
texlive-parsinevis \
texlive-persian-bib \
texlive-quran \
texlive-sexam \
texlive-simurgh \
texlive-texnegar \
texlive-tram \
texlive-xepersian \
texlive-xepersian-hm"

inherit rpm
