SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.10.1"

RPM_NAME = "python313-Paste-3.10.1-4.4.noarch.rpm"
RPM_HASH = "7efb018ce6b50246f621dca06320a2026aa636595a1e5b6ae7f49a127d130a6be0ce60ab68d859a4f068b6f456b3de38914125a7767121168d5bfc8011f0e8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Paste \
python3.13dist-paste \
python313-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
