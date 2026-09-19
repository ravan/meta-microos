SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-jinja2-time-0.2.0-6.4.noarch.rpm"
RPM_HASH = "17f912cfa16b437537f993baf73b8e4a547e5418c4070c3e2a69dc217251c0c236d0b60ca894f24961ebefa4b72b7aefe0b70e094f01ba9c86f603a33ea29430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jinja2-time \
python314-jinja2-time \
python3dist-jinja2-time"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-arrow"

inherit rpm
