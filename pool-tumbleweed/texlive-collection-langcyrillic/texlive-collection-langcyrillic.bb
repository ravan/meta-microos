SUMMARY = "Cyrillic"
DESCRIPTION = "Support for Cyrillic scripts (Bulgarian, Russian, Serbian, \
Ukrainian), even if Latin alphabets may also be used."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn78069"

RPM_NAME = "texlive-collection-langcyrillic-2026.222.svn78069-68.2.noarch.rpm"
RPM_HASH = "923ca087c77321f4c6d68d9ed5dc1ecad52f6f8d709e2abefedeae792db8f09fc378a4d47e17ac3aae361823e85144609a82fe0d59aaa9a82679335fbb5eb65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-cyrillic \
texlive-collection-langcyrillic"

RDEPENDS:${PN} += "texlive-babel-belarusian \
texlive-babel-bulgarian \
texlive-babel-russian \
texlive-babel-serbian \
texlive-babel-serbianc \
texlive-babel-ukrainian \
texlive-churchslavonic \
texlive-cmcyr \
texlive-collection-basic \
texlive-collection-latex \
texlive-cyrillic \
texlive-cyrillic-bin \
texlive-cyrplain \
texlive-disser \
texlive-eskd \
texlive-eskdx \
texlive-gost \
texlive-hyphen-belarusian \
texlive-hyphen-bulgarian \
texlive-hyphen-churchslavonic \
texlive-hyphen-kazakh \
texlive-hyphen-mongolian \
texlive-hyphen-russian \
texlive-hyphen-serbian \
texlive-hyphen-ukrainian \
texlive-lcyw \
texlive-lh \
texlive-lhcyr \
texlive-lshort-bulgarian \
texlive-lshort-mongol \
texlive-lshort-russian \
texlive-lshort-ukr \
texlive-mnhyphn \
texlive-mongolian-babel \
texlive-montex \
texlive-mpman-ru \
texlive-numnameru \
texlive-pst-eucl-translation-bg \
texlive-ruhyphen \
texlive-russ \
texlive-serbian-apostrophe \
texlive-serbian-date-lat \
texlive-serbian-def-cyr \
texlive-serbian-lig \
texlive-t2 \
texlive-texlive-ru \
texlive-texlive-sr \
texlive-ukrhyph \
texlive-xecyrmongolian"

inherit rpm
