SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-pyRFC3339-2.1.0-1.2.noarch.rpm"
RPM_HASH = "ae01f41a92ae39a9ca45f530a58cc9d541f672f1b94130548ced2c4968dcf669c18fcb40ddb7e8426fcbba63b02191588a465f4eb0420ff125cff25b60538c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyRFC3339 \
python3.13dist-pyrfc3339 \
python313-pyRFC3339 \
python3dist-pyrfc3339"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
