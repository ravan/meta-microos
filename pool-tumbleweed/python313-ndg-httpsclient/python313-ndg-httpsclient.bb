SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python313-ndg-httpsclient-0.5.1-5.5.noarch.rpm"
RPM_HASH = "e2bed5e1a8a4f3b978e12a26b0d3584458086d2d32a4e8cced23ea331d2c9a1300a6b142341a5c93f0f134b3a46c77285e55b58161e145f23ac454cab3b8da7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndg-httpsclient \
python3.13dist-ndg-httpsclient \
python313-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pyOpenSSL \
python313-pyasn1"

inherit rpm
