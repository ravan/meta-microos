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

RPM_NAME = "python314-jsonpath-python-1.1.6-1.2.noarch.rpm"
RPM_HASH = "47a9d16260157d3c85d549d43d78aaa831eefd41cdc8eebb5937df1a730402ad922121a0d2cf7c65fad71415c5b93ea9694404ef6cd232707e402406c61f6c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonpath-python \
python314-jsonpath-python \
python3dist-jsonpath-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
