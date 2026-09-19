SUMMARY = "Translation of man pages in Romanian"
DESCRIPTION = "This package provides translations of man pages in Romanian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-ro-4.31.0-1.2.noarch.rpm"
RPM_HASH = "3f89f36e070abf4d3da4cf02888fcf2aa64c7ed9104f49b66f5b68c23db15cffa984315a5ca155dcf57cd06c30875f5203a6691ed79a7318e93a65ca256bc61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-ro \
man-pages-ro"

RDEPENDS:${PN} += "man-pages"

inherit rpm
