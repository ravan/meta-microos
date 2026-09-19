SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.41"

RPM_NAME = "python313-typedload-2.41-1.2.noarch.rpm"
RPM_HASH = "403724b8363d975ea8d5aaefd341057c1897dedda198bc0bb7751c4847deeb36d8ecdff371b9ba51e218d7ed94417ea2820199dd988f54030dce4066b0fb8d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typedload \
python3.13dist-typedload \
python313-typedload \
python3dist-typedload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
