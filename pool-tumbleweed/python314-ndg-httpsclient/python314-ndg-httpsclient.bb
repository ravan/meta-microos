SUMMARY = "HTTPS support for httplib and urllib2 using PyOpenSSL"
DESCRIPTION = "This is a HTTPS client implementation for httplib and urllib2 based on \
PyOpenSSL.  PyOpenSSL provides a more fully featured SSL implementation over the \
default provided with Python and importantly enables full verification of the \
SSL peer."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "python314-ndg-httpsclient-0.5.1-5.5.noarch.rpm"
RPM_HASH = "ff640bbacb813b40efa88afc55ab793d6d9e11ca644ccd3d3e9e126a40391a7eeeccc3267b67d31a6dfcb0a034e5d78640126d850b66aa41257e0718cdf676dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ndg-httpsclient \
python314-ndg-httpsclient \
python3dist-ndg-httpsclient"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pyOpenSSL \
python314-pyasn1"

inherit rpm
