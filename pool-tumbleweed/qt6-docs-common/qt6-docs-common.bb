SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-docs-common-6.11.2-2.1.noarch.rpm"
RPM_HASH = "628ecf2f1cc603d6b4dfe41bdde038c04f6c0884ff55e6a16b7720a7f68055fb996722b0cfcf8c268632691cc4c36647a053c5325e315c7adb289dcc24e42efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"

RDEPENDS:${PN} += ""

inherit rpm
