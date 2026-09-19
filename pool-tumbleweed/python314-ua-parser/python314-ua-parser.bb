SUMMARY = "Python Implementation of UA Parser"
DESCRIPTION = "A python implementation of the UA Parser (https://github.com/ua-parser, formerly \
https://github.com/tobie/ua-parser)"
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python314-ua-parser-1.0.1-2.5.noarch.rpm"
RPM_HASH = "0d6b12da52a2d5665ced2d1751f4ee22217e5b68e5bbd5357d6f9385fb28e60efd9c3cd1326269eef754d90d830f8cf7aef8007c338ca65fa213182ead9155f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ua-parser \
python3.14dist-ua-parser-builtins \
python314-ua-parser \
python3dist-ua-parser \
python3dist-ua-parser-builtins"

RDEPENDS:${PN} += "python-abi"

inherit rpm
