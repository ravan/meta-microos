SUMMARY = "Documentation for texlive-atkinson"
DESCRIPTION = "This package includes the documentation for texlive-atkinson"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-atkinson-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "e910ea7cdb1c1ef2caee546a59deeffca6fcb8aa392512a2dcefeb55da2b60a8f827ad639655a92cc05ff0dde67fe862a050490023b98447a32b0bdfa11f6a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atkinson-doc"

RDEPENDS:${PN} += ""

inherit rpm
