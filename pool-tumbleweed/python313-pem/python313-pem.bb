SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python313-pem-23.1.0-1.12.noarch.rpm"
RPM_HASH = "2421f48713957975646d1f8367a141affa80ab22076c120e4663b7768596358fbe390e94f8190d8d86c9961f202b9f588c382d4d6b23f4c9dbb82cff3403b238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pem \
python3.13dist-pem \
python313-pem \
python3dist-pem"

RDEPENDS:${PN} += "python-abi"

inherit rpm
