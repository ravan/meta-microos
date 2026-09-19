SUMMARY = "Translations for package Font-Downloader"
DESCRIPTION = "Provides translations for the 'Font-Downloader' package."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "Font-Downloader-lang-10.0.0-3.2.noarch.rpm"
RPM_HASH = "c240f1133c79aaed82767a7087621efcd37268d87c40c6859dcd5af37bd7eee75c5ea8861126bb11bccc06e7c45ebdce333b082c74d9f43aa5e9439919fc401b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Font-Downloader-lang \
Font-Downloader-lang-all \
locale-Font-Downloader-bn \
locale-Font-Downloader-ca \
locale-Font-Downloader-cs \
locale-Font-Downloader-de \
locale-Font-Downloader-en-GB \
locale-Font-Downloader-es \
locale-Font-Downloader-fa \
locale-Font-Downloader-fi \
locale-Font-Downloader-gl \
locale-Font-Downloader-he \
locale-Font-Downloader-hi \
locale-Font-Downloader-hr \
locale-Font-Downloader-id \
locale-Font-Downloader-ja \
locale-Font-Downloader-nl \
locale-Font-Downloader-pl \
locale-Font-Downloader-pt-BR \
locale-Font-Downloader-pt-PT \
locale-Font-Downloader-ru \
locale-Font-Downloader-sv \
locale-Font-Downloader-tr \
locale-Font-Downloader-zh-CN"

RDEPENDS:${PN} += "Font-Downloader"

inherit rpm
