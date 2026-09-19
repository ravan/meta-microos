SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "python314-lazr.uri-1.0.8-1.2.noarch.rpm"
RPM_HASH = "ba5f18d0a3723b0738f4685fc157630cbc88c81393a73e2f7a6eadc8ba2c9ca4ff2de6c1f31224a60ef8e6ec55248f88c0e48cc0dbdec22977cc6dea333dcecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lazr.uri \
python314-lazr.uri \
python3dist-lazr.uri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
