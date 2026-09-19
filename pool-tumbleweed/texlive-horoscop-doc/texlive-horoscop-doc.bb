SUMMARY = "Documentation for texlive-horoscop"
DESCRIPTION = "This package includes the documentation for texlive-horoscop"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.01svn56021"

RPM_NAME = "texlive-horoscop-doc-2026.226.1.01svn56021-60.4.noarch.rpm"
RPM_HASH = "6b59387f49d5c112bbc04c8c4dd19172d44ef009c10287226272022633580be765efa3931f4c6f6795dc02a38a45b07e37972fd67123f2610aaddde5aae7436a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-horoscop-doc"

RDEPENDS:${PN} += ""

inherit rpm
