SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "python313-Flask-HTTPAuth-4.8.1-1.2.noarch.rpm"
RPM_HASH = "e05351c329572ca84e5583853b6c879f4379f58a2f8e9ed61fbdfa973849b8c9738d27d1757d51c3996b23657dfdc522a30c0553509aa21b4d1612f07288ed87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-HTTPAuth \
python3.13dist-flask-httpauth \
python313-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python313-Flask"

inherit rpm
