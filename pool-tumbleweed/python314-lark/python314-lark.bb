SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-lark-1.3.1-1.4.noarch.rpm"
RPM_HASH = "5276b0a445e8fef46b5958be3945bd395a37055ec5153ae0ccbdeaadf046596dc578d5c45e5bca02adc58966a3e1d038670424bd0ee9635a483198436a568b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lark \
python314-lark \
python314-lark-parser \
python3dist-lark"

RDEPENDS:${PN} += "python-abi"

inherit rpm
