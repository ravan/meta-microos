SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python314-repoze.sphinx.autointerface-1.0.0-3.5.noarch.rpm"
RPM_HASH = "639afea38196ae551fecb51f6d8cd492f608d28bd48ff39343b80745e45dad33756dce9c9d6018e18f60ee5489e15ddb425450fa94ff208b8bc2cec746964d66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-repoze.sphinx.autointerface \
python314-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-zope.interface"

inherit rpm
