SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python313-localzone-0.9.8-4.4.noarch.rpm"
RPM_HASH = "65de558f31f47f5b9f68fb0425190284d21a3dc978d37791fa582d6c25af21efea971d238ab95821bf2fdb4691e0704b134a8508acda9fea1bae21b443b41484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-localzone \
python3.13dist-localzone \
python313-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python313-dnspython"

inherit rpm
