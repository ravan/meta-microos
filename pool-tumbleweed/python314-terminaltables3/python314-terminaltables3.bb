SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-terminaltables3-4.0.0-1.4.noarch.rpm"
RPM_HASH = "d1881f676e8924e02d4902252b2e4cc905c8077e3a581fb73a35d2b831c5af5ae0c7f90c0cfc0789aedc0cfb3791c4f18b2c472f2a00ec14027897052eb2a274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-terminaltables3 \
python314-terminaltables3 \
python3dist-terminaltables3"

RDEPENDS:${PN} += "python-abi \
python314-colorama \
python314-colorclass \
python314-termcolor"

inherit rpm
