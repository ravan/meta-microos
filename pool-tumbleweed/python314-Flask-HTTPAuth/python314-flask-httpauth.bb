SUMMARY = "Basic and Digest HTTP authentication for Flask routes"
DESCRIPTION = "Simple extension that provides Basic and Digest HTTP authentication for Flask routes."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "python314-Flask-HTTPAuth-4.8.1-1.2.noarch.rpm"
RPM_HASH = "bdc00eb55396fe43c8507b7a5b92315a3929de2dd09daab82d5f0aa8cc44dfe8b4d03faa42e61cf487b159a159cad68c3c2b04585f5a0565ef1cdf58dfa8302e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-httpauth \
python314-Flask-HTTPAuth \
python3dist-flask-httpauth"

RDEPENDS:${PN} += "python-abi \
python314-Flask"

inherit rpm
