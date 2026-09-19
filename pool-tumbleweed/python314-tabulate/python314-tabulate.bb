SUMMARY = "Pretty-printer for tabular data in Python"
DESCRIPTION = "Pretty-printer for tabular data in Python. \
 \
The main use cases of the library are: \
 \
 * printing small tables without hassle: just one function call, \
   formatting is guided by the data itself \
 * authoring tabular data for lightweight plain-text markup: multiple \
   output formats suitable for further editing or transformation \
 * readable presentation of mixed textual and numeric data: smart \
   column alignment, configurable number formatting, alignment by a \
   decimal point"
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-tabulate-0.10.0-1.3.noarch.rpm"
RPM_HASH = "f8d9fb13d09f55feaba67b0f5448ca7478f569ed96eb963dc11ab5fe523dc1c7a6cea6f2f24072dd184e74263410c7231e64be9a80d7ea0a65d716a41233fb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tabulate \
python314-tabulate \
python3dist-tabulate"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
