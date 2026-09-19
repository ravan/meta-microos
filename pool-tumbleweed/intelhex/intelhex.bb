SUMMARY = "Library for Intel HEX Files Manipulations"
DESCRIPTION = "Python implementation of Intel HEX file format allows you read, modify, write \
hex files and convert them to binary form. \
 \
The Intel HEX file format widely used in microprocessors and microcontrollers \
area as the de-facto standard for representation of code for programming \
microelectronic devices. \
 \
This work implements an **intelhex** Python library to read, write, \
create from scratch and manipulate data from HEX (also known as Intel HEX) \
file format. These operations are provided by “IntelHex” class. \
 \
The distribution package also includes several convenience Python scripts \
to do basic tasks that utilize this library. The “bin2hex.py” script \
converts binary data to HEX, and the “hex2bin.py” works the other direction. \
“hex2dump.py” converts data from HEX to a hexdump which is useful for \
inspecting data, and “hexmerge.py” merges multiple HEX files into one."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "intelhex-2.3.0-2.4.noarch.rpm"
RPM_HASH = "7dfecd8a8e91b7ce564627ae9c66b7ff33ca86fd22aba957d025326deff043aa63ef5f3760bfcf4696de2235e9f352db8fb1dc2c82392bea0288dadd6c1b6ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intelhex \
python3.13dist-intelhex \
python3dist-intelhex"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
