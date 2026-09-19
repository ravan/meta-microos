SUMMARY = "Documentation for texlive-xwatermark"
DESCRIPTION = "This package includes the documentation for texlive-xwatermark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-doc-2026.226.1.5.2dsvn61719-59.4.noarch.rpm"
RPM_HASH = "a018ffcad53e8c0623343108b52e26b49f8a8d4d94e487f5bed6162065f02a135994f4dac030f983d7504e97ba2d4be6fc0a20b5587b853c9d9d1cd6a73596ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
