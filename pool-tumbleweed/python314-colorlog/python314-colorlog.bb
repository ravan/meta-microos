SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.10.1"

RPM_NAME = "python314-colorlog-6.10.1-1.4.noarch.rpm"
RPM_HASH = "50ab807462322c0277f5851c44567f86ffb4fd9b400895d4d0b3a18b9a9ac66424a78ddff3c29e3e9d71a3d626a0544f9035901959c5a6f37bc6f648847a9f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colorlog \
python314-colorlog \
python3dist-colorlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
