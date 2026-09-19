SUMMARY = "Human friendly input/output for text interfaces using Python"
DESCRIPTION = "The functions and classes in the humanfriendly package can be used to make \
text interfaces more user friendly. \
 \
 Some example features: \
  * Parsing and formatting numbers, file sizes, pathnames and timespans in \
    simple, human friendly formats. \
  * Easy to use timers for long running operations, with human friendly \
    formatting of the resulting timespans. \
  * Prompting the user to select a choice from a list of options by typing \
    the option’s number or a unique substring of the option. \
  * Terminal interaction including text styling (ANSI escape sequences), user \
    friendly rendering of usage messages and querying the terminal for its size."
LICENSE = "MIT"

PV = "10.0"

RPM_NAME = "python313-humanfriendly-10.0-8.1.noarch.rpm"
RPM_HASH = "102a3287ebdf200d7723b483cae6383fa0f2e72e022b2c4680a4e624bf3b6a77c4f6e2eb9047564ef0bf0a4fda57fdf52315c1bae9b20885a8c0d1105bb5f89f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanfriendly \
python3.13dist-humanfriendly \
python313-humanfriendly \
python3dist-humanfriendly"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313"

inherit rpm
