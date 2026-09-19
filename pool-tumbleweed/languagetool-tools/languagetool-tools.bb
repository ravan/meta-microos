SUMMARY = "Style and Grammar Checker for 25+ Languages - Tools package"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker. \
This package contains the tools for dictionary developers"
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-tools-4.8-13.1.noarch.rpm"
RPM_HASH = "1a5188f00a03fe4d68bf167d5bfe65c5ebddebf84d4f82a17e115fe705865cc703347ca4d3db6b40baef2a085ec8313ba32c3a49170fe97eb4dc38870c2d5917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-tools \
mvn-org.languagetool-languagetool-tools \
mvn-org.languagetool-languagetool-tools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-cli-commons-cli \
mvn-org.carrot2-morfologik-tools \
mvn-org.languagetool-languagetool-core"

inherit rpm
