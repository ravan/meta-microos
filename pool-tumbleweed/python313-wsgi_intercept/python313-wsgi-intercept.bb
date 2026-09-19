SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "python313-wsgi_intercept-1.13.1-2.1.noarch.rpm"
RPM_HASH = "e862b8531e7a5abb05bb8ca0da45fadd05cb9ced9ddc38827717448547a29a5dad58b7b12496ec1540a565c1e1bdb5a0b1794fc6e3d6216bd875fecb8a521781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wsgi-intercept \
python3.13dist-wsgi-intercept \
python313-wsgi-intercept \
python3dist-wsgi-intercept"

RDEPENDS:${PN} += "python-abi"

inherit rpm
