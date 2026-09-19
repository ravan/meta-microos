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

RPM_NAME = "python314-fields-5.0.0-6.4.noarch.rpm"
RPM_HASH = "4d2c5865feccf1d4ae0201ab42cafcf864abfcd4dc2156b2ef2739348ee677bede90794694061908b932280096bd82311a2100366f95e5b68e90306380510a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fields \
python314-fields \
python3dist-fields"

RDEPENDS:${PN} += "python-abi"

inherit rpm
