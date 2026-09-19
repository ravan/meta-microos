SUMMARY = "A more powerful JSONPath implementation in modern Python"
DESCRIPTION = "A more powerful JSONPath implementation in modern Python. \
 \
Features \
 \
* Light. (No need to install third-party dependencies.) \
* Support filter operator, including multi-selection, \
  inverse-selection filtering. \
* Support sorter operator, including sorting by \
  multiple fields, ascending and descending order. \
* Support basic semantics of JSONPath. \
* Support output modes: VALUE, PATH."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "python313-jsonpath-python-1.1.6-1.2.noarch.rpm"
RPM_HASH = "48435c4141104c314b3717c6bdf3cdd75e415727d2a4926f1138185da81fd3e4401a87cff48f9d327004d65e3d217995d4a0f018cca4232b056441d6ed7dc07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-python \
python3.13dist-jsonpath-python \
python313-jsonpath-python \
python3dist-jsonpath-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
