SUMMARY = "Documentation for texlive-texliveonfly"
DESCRIPTION = "This package includes the documentation for texlive-texliveonfly"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.svn76924"

RPM_NAME = "texlive-texliveonfly-doc-2026.227.svn76924-62.2.noarch.rpm"
RPM_HASH = "3a926293f53534575694f725e4a6edd6b555becebab046a31539ad81470a3ac82cc8acd093d89dfe98df0404b7333c294eaef9295f6ac01aa63beff06bd23d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texliveonfly-doc"

RDEPENDS:${PN} += ""

inherit rpm
