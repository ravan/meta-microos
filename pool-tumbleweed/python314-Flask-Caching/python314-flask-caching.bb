SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python314-Flask-Caching-2.3.1-1.5.noarch.rpm"
RPM_HASH = "d7315ed5cb321ade0c54beb962609fe87d67fabd77e617454cee19cdf6eece4ed4c00144e4e105d4adbe56e4ac69899ac2e5c061712a3f4bb3610045b4020daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-caching \
python314-Flask-Caching \
python3dist-flask-caching"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-cachelib"

inherit rpm
