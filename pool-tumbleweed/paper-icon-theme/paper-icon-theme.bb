SUMMARY = "Paper Icon theme"
DESCRIPTION = "Paper is a simple and modern icon theme with Material Design influences."
LICENSE = "CC-BY-SA-4.0"

PV = "1.5.0+git32.aa3e8af7"

RPM_NAME = "paper-icon-theme-1.5.0+git32.aa3e8af7-1.16.noarch.rpm"
RPM_HASH = "a58b481ba959836219b05097d0703ab753d478eb6af12f1abc7b7e2e73e0100ef174c59772816cb3fd0c5ca7dd94daab1877a919f245779080a539db7da25c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paper-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
