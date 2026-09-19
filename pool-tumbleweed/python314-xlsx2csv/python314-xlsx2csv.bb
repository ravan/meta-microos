SUMMARY = "Tool to convert from xlsx to csv"
DESCRIPTION = "A tool to convert xlsx files to the csv format."
LICENSE = "MIT"

PV = "0.8.6"

RPM_NAME = "python314-xlsx2csv-0.8.6-2.4.noarch.rpm"
RPM_HASH = "217175f076e158cb464c9fa7ff9441c779363e4f4506cf11a562cb73f7f18750503ef1d03a23c0b0ea5a26f5a7be41cf1515d942c279c7fae06aea94d23db28f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xlsx2csv \
python314-xlsx2csv \
python3dist-xlsx2csv \
xlsx2csv"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi"

inherit rpm
