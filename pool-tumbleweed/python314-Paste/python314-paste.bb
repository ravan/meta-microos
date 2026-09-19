SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.10.1"

RPM_NAME = "python314-Paste-3.10.1-4.4.noarch.rpm"
RPM_HASH = "02f856ff52dbb5eb29e4a58a0d51e85aa3b7990cadc3e2832550c91c0bcf46e4ff6a5d5e7386bbcee9e63080187e2064e6abd1b9c5b88e398b3154f5de9bd5de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-paste \
python314-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
