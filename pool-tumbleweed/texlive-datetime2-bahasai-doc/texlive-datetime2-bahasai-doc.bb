SUMMARY = "Documentation for texlive-datetime2-bahasai"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-bahasai"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn46287"

RPM_NAME = "texlive-datetime2-bahasai-doc-2026.226.1.01svn46287-61.2.noarch.rpm"
RPM_HASH = "27c35a2a0948bf37b321989aa6d7750bd3e9b6490ae986d6e006f581c4729bd613c9e0d82c0eac15ef52e6c0688e48916e0dfd46ff04cbebd2add48aaf5fd80a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-bahasai-doc"

RDEPENDS:${PN} += ""

inherit rpm
