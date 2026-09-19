SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python313-flask-restx-1.3.2-1.2.noarch.rpm"
RPM_HASH = "856d106db46ec0091d71c5a829a8144c099a945e68b2934de996e1008e2e1ae14b1df6f2f2803d10bdbe55b81f6f5bc7bcce4ba2ac5d527826df84c9ce4402fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-restx \
python3.13dist-flask-restx \
python313-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Werkzeug \
python313-aniso8601 \
python313-jsonschema \
python313-referencing"

inherit rpm
