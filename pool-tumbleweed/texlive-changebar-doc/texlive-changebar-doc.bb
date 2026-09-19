SUMMARY = "Documentation for texlive-changebar"
DESCRIPTION = "This package includes the documentation for texlive-changebar"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.7esvn77682"

RPM_NAME = "texlive-changebar-doc-2026.226.3.7esvn77682-59.2.noarch.rpm"
RPM_HASH = "3c0c69623dfd73a60798e6da60143d365395bde183464d7a081f7ee9f56c09385a273cc4588b4141f01eba9e176bb7f34c644c9c64ef0b212682041417d016df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
