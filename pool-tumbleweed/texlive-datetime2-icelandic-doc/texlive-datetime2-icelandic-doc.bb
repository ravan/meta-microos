SUMMARY = "Documentation for texlive-datetime2-icelandic"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-icelandic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn65213"

RPM_NAME = "texlive-datetime2-icelandic-doc-2026.226.1.2svn65213-59.2.noarch.rpm"
RPM_HASH = "6260ca3bc80e07374ff54651087f4e7e6a7ac08f5da6a933fd5f00f88d980a3495adddb28f01667e3165476915760e78e95785ca2c689ca7bb74173875b2e609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-icelandic-doc"

RDEPENDS:${PN} += ""

inherit rpm
