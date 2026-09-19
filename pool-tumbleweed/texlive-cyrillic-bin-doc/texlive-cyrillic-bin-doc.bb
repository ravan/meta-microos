SUMMARY = "Documentation for texlive-cyrillic-bin"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62517"

RPM_NAME = "texlive-cyrillic-bin-doc-2026.226.svn62517-61.2.noarch.rpm"
RPM_HASH = "c483d527952459438cfb3a017742d98af1f9429c3b4b4a51df57b5ee58586b6c42e2ce04c2e055f07a6b8ca14b3e813b41f697e7f6b0ceb94b06679b95e0cb32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-rubibtex.1 \
man-rumakeindex.1 \
texlive-cyrillic-bin-doc"

RDEPENDS:${PN} += ""

inherit rpm
