SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "python313-lazr.uri-1.0.8-1.2.noarch.rpm"
RPM_HASH = "67b1c79592ac8a482a69de1e9ed8d744b566075ebd12d4862f6a069b2ea2bfc9192f0b42c44ff233d7486978d7192ab80d6d5986df32fcae8554a45801304abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.uri \
python3.13dist-lazr.uri \
python313-lazr.uri \
python3dist-lazr.uri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
