SUMMARY = "Documentation for texlive-diagbox"
DESCRIPTION = "This package includes the documentation for texlive-diagbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-diagbox-doc-2026.226.2.4svn77682-59.2.noarch.rpm"
RPM_HASH = "7795b659d38f9beb32cee332aca8619dc73aa15e54ca841de08aef6422965f62afbdae5aca7a93a190a9cbaf6c8be8b51a1829e26724cafcbb40c91fa5b2fb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
