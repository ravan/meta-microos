SUMMARY = "A Python library to parse, create and handle HL7 v2x messages"
DESCRIPTION = "HL7apy is a Python package to handle HL7 <http://www.hl7.org> v2 \
messages according to HL7 specifications. \
 \
The main features include: \
 * Message parsing \
 * Message creation \
 * Message validation following the HL7 xsd specifications \
 * Access to elements by name, long name or position \
 * Support to all simple and complex datatypes \
 * Encoding chars customization \
 * Message encoding in ER7 format and compliant with MLLP protocol"
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python314-hl7apy-1.3.4-1.12.noarch.rpm"
RPM_HASH = "9649eabfc3933707958e382dca749880780de1de7f69db2d76c74c51ed7cd3d9272804a9292401a1541b176bfdebfefb5644e1b56a498ba48fa8d9b384dc2c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hl7apy \
python314-hl7apy \
python3dist-hl7apy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
