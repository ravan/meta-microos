SUMMARY = "Text Parsing Function Dispatcher"
DESCRIPTION = "TPFD (Text Parsing Function Dispatcher) is an easy way to parse strings and execute \
functions depending on their contents. \
 \
Inspired by Flask and using Parse under the hood, TPFD allows you to decorate functions \
with grammar rules and if a pattern that matches one of your grammar rules is found, \
the function will be run with a set of keyword arguments you've specified passed to it! \
Great for parsing logs and executing macros on what it finds!"
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python314-tpfd-0.2.4-2.10.noarch.rpm"
RPM_HASH = "05baf13d51f43c81b3d8281010d04d8c0adc65d1fb9f36becb12975bf740e72ea693d811df92733b95323e86f223f70dac4e63ae4c69c0ecd75275b7a5b4db89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tpfd \
python314-tpfd \
python3dist-tpfd"

RDEPENDS:${PN} += "python-abi \
python314-parse"

inherit rpm
