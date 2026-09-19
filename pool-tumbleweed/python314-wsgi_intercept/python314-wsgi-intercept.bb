SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "python314-wsgi_intercept-1.13.1-2.1.noarch.rpm"
RPM_HASH = "1c7dd93b9c2059df1991eb67bbf0e4db44b8ed224af7dbc45afc690490b0932db762e35ae72aba0d847a2f82209381229d9c67bfc0362cd1638d0687f421687f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wsgi-intercept \
python314-wsgi-intercept \
python3dist-wsgi-intercept"

RDEPENDS:${PN} += "python-abi"

inherit rpm
