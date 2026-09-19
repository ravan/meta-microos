SUMMARY = "Format agnostic tabular data library (XLS, JSON, YAML, CSV)"
DESCRIPTION = "Tablib is a format-agnostic tabular dataset library, written in Python. \
 \
Output formats supported: \
 \
- Excel (Sets + Books) \
- JSON (Sets + Books) \
- YAML (Sets + Books) \
- HTML (Sets) \
- TSV (Sets) \
- CSV (Sets)"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python313-tablib-3.10.0-1.1.noarch.rpm"
RPM_HASH = "c3b5b9eb672b0655380e8d0957c26109957ee7665c71fdf98997f607895a334dbc4bef35b568b4ffa75ade8e910baaaa361574afb5cd3dd6d2ab5ed654dc091e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tablib \
python3.13dist-tablib \
python313-tablib \
python3dist-tablib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
