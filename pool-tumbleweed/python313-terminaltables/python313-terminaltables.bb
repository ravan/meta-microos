SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.10"

RPM_NAME = "python313-terminaltables-3.1.10-2.8.noarch.rpm"
RPM_HASH = "b2c2d40f33d7b5eeb709e73d3a882ab0f91cb4b4e643cb0fe4f01efc3194e6c1958da98a5727973d5119e05531701f1cfb47f1a65f43dae01f533aa19c8025ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminaltables \
python3.13dist-terminaltables \
python313-terminaltables \
python3dist-terminaltables"

RDEPENDS:${PN} += "python-abi \
python313-colorama \
python313-colorclass \
python313-termcolor"

inherit rpm
