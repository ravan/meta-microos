SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.2"

RPM_NAME = "python314-binary-1.0.2-1.3.noarch.rpm"
RPM_HASH = "1a268ef8b5e089719163d93eac3a2c31e526717907015f33a4c4462295adcec4a9ed5f1981bda1d4c146027a8caa7c43e18d67299cdf1b90ada74f9e01768e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-binary \
python314-binary \
python3dist-binary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
