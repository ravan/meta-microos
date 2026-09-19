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

RPM_NAME = "python313-pefile-2024.8.26-1.2.noarch.rpm"
RPM_HASH = "b69fec20564e3fe44d829cdfb3c39d780fe560f5204f3ef0946a2412f7fe6dbfc39880e9de81478d112d66c2a8d76be040ed48684ed7e1553472439d5516442c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pefile \
python3.13dist-pefile \
python313-pefile \
python3dist-pefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
