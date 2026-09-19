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

RPM_NAME = "python314-humanfriendly-10.0-8.1.noarch.rpm"
RPM_HASH = "732cba49b01cae743d3850149065f9f3add3f3cd46904bae16c443dd76d72e9eba8269e0e3a4664ff7ae0dd4bf179138c93bd3a4f26666305a9d9d8a16810d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-humanfriendly \
python314-humanfriendly \
python3dist-humanfriendly"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314"

inherit rpm
