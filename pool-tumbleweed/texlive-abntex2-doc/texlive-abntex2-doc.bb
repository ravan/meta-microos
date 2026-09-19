SUMMARY = "Documentation for texlive-abntex2"
DESCRIPTION = "This package includes the documentation for texlive-abntex2"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.7svn49248"

RPM_NAME = "texlive-abntex2-doc-2026.226.1.9.7svn49248-61.2.noarch.rpm"
RPM_HASH = "74ec99f6dbeaf83ba41db2e28bd469b7c5606c0fa038844b2c65d54995b5460516b7afbefc5df364d8aaedba7e34debcc3835df8e2840472dab70eb1d39cfa55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abntex2-doc-pt-BR \
texlive-abntex2-doc"

RDEPENDS:${PN} += ""

inherit rpm
