SUMMARY = "Documentation for texlive-outoruby"
DESCRIPTION = "This package includes the documentation for texlive-outoruby"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.0.1svn74638"

RPM_NAME = "texlive-outoruby-doc-2026.226.0.0.0.1svn74638-61.2.noarch.rpm"
RPM_HASH = "1c534aee86afe51e218b878679883054a03ce850384b7cfb92b97f7217564d44469ea265c712f5dfb8f1ab801abeee56289e9d7cd12353fd7e0b7fbe38b7a5c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-outoruby-doc-ja \
texlive-outoruby-doc"

RDEPENDS:${PN} += ""

inherit rpm
