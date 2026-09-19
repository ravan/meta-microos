SUMMARY = "Security oriented static analyser for Python code"
DESCRIPTION = "Bandit is a tool designed to find common security issues in Python code. To do \
this Bandit processes each file, builds an AST from it, and runs appropriate \
plugins against the AST nodes. Once Bandit has finished scanning all the files \
it generates a report."
LICENSE = "Apache-2.0"

PV = "1.9.4"

RPM_NAME = "python3-bandit-1.9.4-1.2.noarch.rpm"
RPM_HASH = "761c562468f1cd7cbb0c130182135d7f60c39cecfd65b1c90b99de5f5f986310fca56ca26c559b2d761448217f6c0b50fba0840820640c2ed9c71aa8831d3fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bandit \
python3.13dist-bandit \
python3dist-bandit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python3-GitPython \
python3-PyYAML \
python3-jschema-to-python \
python3-rich \
python3-sarif-om \
python3-stestr \
python3-stevedore"

inherit rpm
