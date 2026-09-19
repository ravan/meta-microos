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

RPM_NAME = "python314-tablib-3.10.0-1.1.noarch.rpm"
RPM_HASH = "a03e4747c82df3efd8a06b450c65e1b08dd62a69efd0401524db88ef140b7c8099fe758b7d8a9b587507b6b80f2186b3a063e7529dc4a79f095bddc9bc787d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tablib \
python314-tablib \
python3dist-tablib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
