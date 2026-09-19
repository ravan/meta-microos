SUMMARY = "Implementation of the IPP core protocol in pure GO"
DESCRIPTION = "The goipp library is fairly complete implementation of IPP core protocol in pure Go. \
Essentially, it is IPP messages parser/composer. Transport is not implemented \
here, because Go standard library has an excellent built-in HTTP client, \
and it doesn't make a lot of sense to wrap it here. \
 \
High-level requests, like 'print a file' are also not implemented, \
only the low-level stuff."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "goipp-1.2.0-1.5.noarch.rpm"
RPM_HASH = "65d9c9efe5551cee4b41b0ecff87d636508414eee1ba7bd2304e07458379a924797960fd9fb5aba3e7590d5d7d471b16c3622a03fa88c0d43a63298f74888e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goipp"

RDEPENDS:${PN} += ""

inherit rpm
