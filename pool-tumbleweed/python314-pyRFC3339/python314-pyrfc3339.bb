SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-pyRFC3339-2.1.0-1.2.noarch.rpm"
RPM_HASH = "354df8af8814f6d3033acaf6544ed51a9cc2fb42675472921785f2e912d0ea328fe4c313ea7320575d3979713f4ef200efbe21ed0e53d6ceb9c606bcddfd7689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyrfc3339 \
python314-pyRFC3339 \
python3dist-pyrfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
