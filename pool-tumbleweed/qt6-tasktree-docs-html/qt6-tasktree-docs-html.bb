SUMMARY = "Documentation for qt6-tasktree in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tasktree in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-tasktree-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "556cf81046eccacb8c981441e91b8bdd5729125431b25c5fb53e7495fbde947ef1af65f17c3159579e6101dfaa418514a6e0c84cc9cd16841ce12fa0d25577d7"

RPROVIDES:${PN} += "qt6-tasktree-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
