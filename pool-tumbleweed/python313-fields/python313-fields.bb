SUMMARY = "Container class boilerplate killer"
DESCRIPTION = "Container class boilerplate killer. \
Features: \
  * Human-readable ``__repr__`` \
  * Complete set of comparison methods \
  * Keyword and positional argument support. Works like a normal class - you can override just about anything in the \
    subclass (eg: a custom ``__init__``). In contrast, `hynek/characteristic <https://github.com/hynek/characteristic>`_ \
    forces different call schematics and calls your ``__init__`` with different arguments."
LICENSE = "BSD-2-Clause"

PV = "5.0.0"

RPM_NAME = "python313-fields-5.0.0-6.4.noarch.rpm"
RPM_HASH = "2f0c7bc7c182f954559e36f19384b8614b29b74ad09452db63d1e07876ef6c98d1426bf30fc26f3a834eb71b39fd152b49136353b019211bb9af70a9684192ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fields \
python3.13dist-fields \
python313-fields \
python3dist-fields"

RDEPENDS:${PN} += "python-abi"

inherit rpm
