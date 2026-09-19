SUMMARY = "Module for the development of flexible plugin systems"
DESCRIPTION = "PluginBase is a module for Python that enables the development of \
flexible plugin systems."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python314-pluginbase-1.0.1-2.5.noarch.rpm"
RPM_HASH = "6f8f5be2917322b00f64a078507ce39f18585bf6f32c87d287f7d3ae252f7d827003d15eba05f92656a7f28205c2c88a97f16c96885378610d9bf555403c0695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pluginbase \
python314-pluginbase \
python3dist-pluginbase"

RDEPENDS:${PN} += "python-abi"

inherit rpm
