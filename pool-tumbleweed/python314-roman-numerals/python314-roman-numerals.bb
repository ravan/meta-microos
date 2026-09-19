SUMMARY = "Manipulate well-formed Roman numerals"
DESCRIPTION = "A library for manipulating well-formed Roman numerals."
LICENSE = "0BSD"

PV = "4.1.0"

RPM_NAME = "python314-roman-numerals-4.1.0-1.3.noarch.rpm"
RPM_HASH = "2d2af9f183c7b948ad56c3c90b26db56803cdab13d054c529196252ff43cd62db16bd641492e864584663ec5ab19dbf92a9a8d805340bde3643fd1598f20ffb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-roman-numerals \
python314-roman-numerals \
python3dist-roman-numerals"

RDEPENDS:${PN} += "python-abi"

inherit rpm
