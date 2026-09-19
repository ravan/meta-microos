SUMMARY = "Javadoc for languagetool-tools"
DESCRIPTION = "This package contains javadoc for languagetool-tools."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-tools-javadoc-4.8-13.1.noarch.rpm"
RPM_HASH = "9f3f72839d49f6973439e3b4b0d98f41fa33289708b347ea39e94e6994464b72997b0dd92a7d24e8c2c9b473ea864914653176b98326acbee0e47366f74c33bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
