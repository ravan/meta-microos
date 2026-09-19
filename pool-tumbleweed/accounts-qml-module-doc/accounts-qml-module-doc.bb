SUMMARY = "Documentation for accounts-qml-module"
DESCRIPTION = "This package contains the developer documentation for accounts-qml-module."
LICENSE = "LGPL-2.1-only"

PV = "0.7git.20231028T182937~05e79eb"

RPM_NAME = "accounts-qml-module-doc-0.7git.20231028T182937~05e79eb-1.8.noarch.rpm"
RPM_HASH = "2b5ef4c6c36c50a19b8b81c249e3a4fa214eeab7a6d0ec7efa05dbe3726a51beb9a8eb4cac46e3bcea157c202316f204976fb71d31e9f1ed597f8b9de45e1e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accounts-qml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
