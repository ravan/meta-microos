SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "python314-pymilter-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "0ef938b6108057e222d1a6676fb35b747cfb88ed402b4981211ef4081fa5cb2ebf8fb96b771fef838b6b15469173efaec1b1a9f50c4bd10b77cb6a2faf7573d8"

RPROVIDES:${PN} += "python3.14dist-pymilter \
python314-pymilter \
python3dist-pymilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmilter.so.1.0 \
pymilter-common \
python-abi \
python314 \
python314-bsddb3 \
python314-py3dns"

inherit rpm
