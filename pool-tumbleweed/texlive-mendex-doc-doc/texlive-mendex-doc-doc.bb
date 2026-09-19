SUMMARY = "Documentation for texlive-mendex-doc"
DESCRIPTION = "This package includes the documentation for texlive-mendex-doc"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77843"

RPM_NAME = "texlive-mendex-doc-doc-2026.226.svn77843-59.2.noarch.rpm"
RPM_HASH = "ce44ffa4119691b8dc562bb4a4c890a4ca0c98822ed2c57c2eedbbcd250f2ce7bd5fd649d9374dce67522f3081ccbc1caf35f5488217262a3a7a056862d4c31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mendex-doc-doc-ja \
texlive-mendex-doc-doc"

RDEPENDS:${PN} += ""

inherit rpm
