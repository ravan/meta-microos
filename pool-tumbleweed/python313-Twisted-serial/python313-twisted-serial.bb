SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "26.4.0"

RPM_NAME = "python313-Twisted-serial-26.4.0-3.3.noarch.rpm"
RPM_HASH = "7e85b4142fe29f8ca3538d091362220e6657be0a8f4b11ea521df620a7b5a9d217abe9f92b1a040ab3c59de0f2a4605037ccd8770a96143e4fc2f3fb1031c67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-serial \
python313-Twisted-serial"

RDEPENDS:${PN} += "python313-Twisted \
python313-pyserial"

inherit rpm
