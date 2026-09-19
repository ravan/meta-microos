SUMMARY = "A python module to work with PE (pertable executable) files"
DESCRIPTION = "Portable Executable reader module. \
 \
All the PE file basic structures are available with their default names as \
attributes of the instance returned. \
 \
Processed elements such as the import table are made available with lowercase \
names, to differentiate them from the upper case basic structure names. \
 \
pefile has been tested against many edge cases such as corrupted and malformed \
PEs as well as malware, which often attempts to abuse the format way beyond its \
standard use. To the best of my knowledge most of the abuse is handled \
gracefully."
LICENSE = "MIT"

PV = "2024.8.26"

RPM_NAME = "python314-pefile-2024.8.26-1.2.noarch.rpm"
RPM_HASH = "baf33e41f573b330779dc2e1a896cd5148e63277e7f55f57055ce5d619b537de414822cf88ee30af9d3e506ed84c6f57f88f901853c2c109db27cb029754a8e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pefile \
python314-pefile \
python3dist-pefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
