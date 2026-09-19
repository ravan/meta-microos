SUMMARY = "Javadoc for paranamer"
DESCRIPTION = "This package contains the API documentation for paranamer."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-javadoc-2.8-4.10.noarch.rpm"
RPM_HASH = "45ba0fc48b7d75bbcf24a2893581b6828601eae35da20b7536c4fd7a48ea164c6832d9373023579d2193106262ec4e73799a65462c18753e06e26813abf7fba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "paranamer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
