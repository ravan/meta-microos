SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python313-tableprint-0.9.1-4.12.noarch.rpm"
RPM_HASH = "41c16d81ac50b3966cdc6b27a2e63be222a5634340306e9a2e97fef1e7f563adb4ddf18d2730c96b9094b423d961eca492ad9e2bb297c97c3610258973a23f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableprint \
python3.13dist-tableprint \
python313-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python313-wcwidth"

inherit rpm
