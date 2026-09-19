SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python314-iniparse-0.5-10.4.noarch.rpm"
RPM_HASH = "d44cd29de548ebc7ed5061373f3fcdbd2bdc448563d8ea9ba0840f9c1fe0d7eb2a986bd8a1e6130c5483d224708ff37ff0654ec251570afa6fd98e15e4bdaf9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-iniparse \
python314-iniparse \
python3dist-iniparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
