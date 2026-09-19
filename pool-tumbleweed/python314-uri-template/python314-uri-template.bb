SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-uri-template-1.3.0-1.12.noarch.rpm"
RPM_HASH = "32e657a091ce0018739a59670e8172ea51465bca18d9fe4096e3cf7be2a7ad4007ff40ac9647bc0c328ab2be785abf28699326d9bd86b1f17fef23fa5060ab02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uri-template \
python314-uri-template \
python3dist-uri-template"

RDEPENDS:${PN} += "python-abi"

inherit rpm
