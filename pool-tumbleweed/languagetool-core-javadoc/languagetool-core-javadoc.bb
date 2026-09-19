SUMMARY = "Javadoc for languagetool-core"
DESCRIPTION = "This package contains javadoc for languagetool-core."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-core-javadoc-4.8-13.1.noarch.rpm"
RPM_HASH = "55d03bb306e9dea109acb3b12db3a8688ddb27541c29835bed1add4169df4540c6aee2e756d748054ff96cd2ef0fa9b68ac5d9a6b85c8cce63ec4aa02f6246ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
