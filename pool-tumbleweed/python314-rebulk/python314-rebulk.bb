SUMMARY = "Library for defining bulk search patterns to perform advanced string matching"
DESCRIPTION = "ReBulk is a Python library that performs advanced searches in \
strings that would be hard to implement using the re module or \
String methods only. \
 \
It includes some features like Patterns, Match, Rule that \
allow building a custom and complex string matcher."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python314-rebulk-6.0.1-1.1.noarch.rpm"
RPM_HASH = "c0d07dd0aa28455a5fdc451aa61e9b40db7117008822b15a3675fe56d9705a699a03133c62d3fe0bd444cc9ecd276b4842917870c055893988ef19a6cd4357bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rebulk \
python314-rebulk \
python3dist-rebulk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
