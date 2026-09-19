SUMMARY = "Tool to convert from xlsx to csv"
DESCRIPTION = "A tool to convert xlsx files to the csv format."
LICENSE = "MIT"

PV = "0.8.6"

RPM_NAME = "python313-xlsx2csv-0.8.6-2.4.noarch.rpm"
RPM_HASH = "a50d06539735539a03c2c5d9d0c408d119ce88701be9925e35bd280055c606747de7cbe6db1982f2a213ee9473d7d19245a4a8655d07fbd1b032fe9e16097a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlsx2csv \
python3.13dist-xlsx2csv \
python313-xlsx2csv \
python3dist-xlsx2csv \
xlsx2csv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi"

inherit rpm
