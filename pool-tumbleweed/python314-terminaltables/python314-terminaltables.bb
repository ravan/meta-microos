SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.10"

RPM_NAME = "python314-terminaltables-3.1.10-2.8.noarch.rpm"
RPM_HASH = "b4a116a2259006c36cf2e9b9143086f5a1a673b7aacd9ad16082b33cffd79e74ea0dc9f83311311a0f214f940aebb40dbe73c6259fcdf9c879653149764a08f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-terminaltables \
python314-terminaltables \
python3dist-terminaltables"

RDEPENDS:${PN} += "python-abi \
python314-colorama \
python314-colorclass \
python314-termcolor"

inherit rpm
