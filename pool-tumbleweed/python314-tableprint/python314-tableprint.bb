SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-tableprint-0.9.1-4.12.noarch.rpm"
RPM_HASH = "dcd90ca0526f6342441b1ac71224b2d1824f3f8d164edb804091f18dbe2d13b3d4d715ee3702107df18c6593f17ff6ffa22c34be9055d27bf3e4a9a0a1de97f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tableprint \
python314-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python314-wcwidth"

inherit rpm
