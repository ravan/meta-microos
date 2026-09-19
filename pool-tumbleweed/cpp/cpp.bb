SUMMARY = "The system GNU Preprocessor"
DESCRIPTION = "The system GNU Preprocessor."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "cpp-16-1.1.aarch64.rpm"
RPM_HASH = "bb56479483de969d8f121e1a1689571ee687a091ff01b0d61df9b64767066000d4ecbb6039d54e1e5b2369800a3562d105ab6856f9586e302b00ed976a0f2dc5"

RPROVIDES:${PN} += "cpp"

RDEPENDS:${PN} += "/usr/bin/sh \
cpp16"

inherit rpm
