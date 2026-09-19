SUMMARY = "Adds caching support to your Flask application"
DESCRIPTION = "Adds caching support to your Flask application. Continuation of the Flask-Cache \
Extension."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python313-Flask-Caching-2.3.1-1.5.noarch.rpm"
RPM_HASH = "aeb3ff299b8efb527c33fb8dfe89a95a9be0f4951f8cd3b4388f869f81235a79ed9f4f0433f3066c386fcc88fbf4d31c48cca1b91f93cbc19896dd9fc8b66c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Caching \
python3.13dist-flask-caching \
python313-Flask-Caching \
python3dist-flask-caching"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-cachelib"

inherit rpm
