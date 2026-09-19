SUMMARY = "Documentation for texlive-glossaries-french"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-french"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-doc-2026.226.1.1svn42873-60.4.noarch.rpm"
RPM_HASH = "411e6b11677e917630c5b322e53d481084567dac3427c641f37427b383284d219fd0f4de65d6c7461ff266e72c13f67e5a910948809c3def54cdc433aa8d7e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
