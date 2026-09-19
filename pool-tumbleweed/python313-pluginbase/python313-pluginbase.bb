SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python313-pluginbase-1.0.1-2.5.noarch.rpm"
RPM_HASH = "a62fe5e643bc1b36f37501906111a041bd1c5f2854a3379ba1a9dfb9f7c061128841744d60273687b27cb09bbf99e2ef9d8d06961e0c11bcbbd863b256c5a04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pluginbase \
python3.13dist-pluginbase \
python313-pluginbase \
python3dist-pluginbase"

RDEPENDS:${PN} += "python-abi"

inherit rpm
