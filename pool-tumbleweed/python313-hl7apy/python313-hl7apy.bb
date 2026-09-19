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

RPM_NAME = "python313-hl7apy-1.3.4-1.12.noarch.rpm"
RPM_HASH = "05a3fc534d8709c90f672fe55c9cbc2ea046fa5c002386d95782d5f33ec2cbcad9cf2ea187ea71fee4a8484a04a32fd5df8434273559ceb4216d1ffe8ff0c465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hl7apy \
python3.13dist-hl7apy \
python313-hl7apy \
python3dist-hl7apy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
