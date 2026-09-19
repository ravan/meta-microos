SUMMARY = "Documentation for texlive-mltex"
DESCRIPTION = "This package includes the documentation for texlive-mltex"
LICENSE = "SUSE-TeX"

PV = "2026.226.2.2svn71363"

RPM_NAME = "texlive-mltex-doc-2026.226.2.2svn71363-61.2.noarch.rpm"
RPM_HASH = "f4583db8133038ae775ce5926b996a2c06a0d49bf1444b31ff3ae5196b0b97b9134b41ca80adc36acb21f5a74a3f08adbfe49831abba275e1cfb5764133a64a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
