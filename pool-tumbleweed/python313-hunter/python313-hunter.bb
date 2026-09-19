SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.9.0"

RPM_NAME = "python313-hunter-3.9.0-2.1.aarch64.rpm"
RPM_HASH = "56d512fe879155f571f4566172989d94186b9ee2716348b1f073c289173a67def24852338b17c36b829ee1449454549fcdddebc4886c0544d847d39ab21ed8c9"

RPROVIDES:${PN} += "python3-hunter \
python3.13dist-hunter \
python313-hunter \
python3dist-hunter"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
