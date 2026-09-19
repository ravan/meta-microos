SUMMARY = "Tool to repackage Java libraries"
DESCRIPTION = "Jar Jar Links is a utility that repackages Java libraries and embeds \
them into a distribution of its own. This is useful for two reasons: \
You can easily ship a single jar file with no external dependencies. \
You can avoid problems where your library depends on a specific \
version of a library, which may conflict with the dependencies of \
another library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "jarjar-javadoc-1.4-6.7.noarch.rpm"
RPM_HASH = "5ef627755f5a120c8fd282ae42230b137f1eb67c34d70b7721ec363ea5b356ca9216463ac7beaee7c1107e1852f90bae651cc8320b9208d5a1f03ce8d87c5de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jarjar-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
