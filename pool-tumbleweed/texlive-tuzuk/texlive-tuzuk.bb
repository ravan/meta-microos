SUMMARY = "Turkish bylaws and regulations document class"
DESCRIPTION = "The tuzuk class provides a standardized format for writing \
bylaws and regulations in Turkish-governmental style. It \
includes features for creating numbered articles, subsections, \
and signature areas commonly found in legal documents. \
Features: Easy creation of numbered articles with the \\madde \
command, Section titles with \\bolumadi, Automatic lettered \
lists with the fikra environment, Built-in signature area \
formatting with \\imzalar, Full Turkish language support. Built \
originally for creating the regulation for Ozgur Yazilim \
Dernegi (The Free Software Association in Turkey), \
https://oyd.org.tr/. Explanation of the package name: 'tuzuk' \
in Turkish means 'regulations', as a document. For example, \
GDPR, which stands for 'General Data Protection Regulation', \
translates as 'Genel Veri Koruma Tuzugu'. In Turkish law, the \
non-profit associations have a 'tuzuk' as their \
constitution-like governing document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn74620"

RPM_NAME = "texlive-tuzuk-2026.226.1.0.0svn74620-59.2.noarch.rpm"
RPM_HASH = "725c4ba2964e5e349db1b32685b171a520535f171c58ff4941d0e42c36e50ec6d1074314ae0499eba51f5ea399a44ef02177c65348f2585f930581290743be3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tuzuk.cls \
texlive-tuzuk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-hyphenat.sty \
tex-inputenc.sty \
tex-mathptmx.sty \
tex-setspace.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
