SUMMARY = "Sphinx extension: auto-generates API docs from Zope interfaces"
DESCRIPTION = "Thie package defines an extension for the Sphinx documentation system. The \
extension allows generation of API documentation by introspection of \
zope.interface instances in code."
LICENSE = "SUSE-Repoze"

PV = "1.0.0"

RPM_NAME = "python313-repoze.sphinx.autointerface-1.0.0-3.5.noarch.rpm"
RPM_HASH = "a33a0cd20548686e0c8a89b3a9b96218868a54c8ee8e7e3667d23c7ce319ab95367bf1e8e0cab9254dec85f482fbaafe491d64c67e71b30a39de073dcb6b33cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.sphinx.autointerface \
python3.13dist-repoze.sphinx.autointerface \
python313-repoze.sphinx.autointerface \
python3dist-repoze.sphinx.autointerface"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-zope.interface"

inherit rpm
