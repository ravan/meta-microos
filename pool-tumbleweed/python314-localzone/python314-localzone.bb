SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python314-localzone-0.9.8-4.4.noarch.rpm"
RPM_HASH = "79af383f5f2a0f3c7c06c20f4f07e27afb692fac4a31ec800bf301b887c30733acea1f23969ed1d2c2f3b82cec971ec1ae658e3cf9b17afb6b0bd5a003fd61d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-localzone \
python314-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python314-dnspython"

inherit rpm
