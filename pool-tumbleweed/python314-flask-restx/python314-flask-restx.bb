SUMMARY = "Framework for fast, easy and documented API development with Flask"
DESCRIPTION = "Flask-RESTX is a community driven fork of Flask-RESTPlus. It is an extension for Flask \
that adds support for quickly building REST APIs. It encourages best practices with \
minimal setup. If you are familiar with Flask, Flask-RESTX should be easy to pick up. \
It provides a coherent collection of decorators and tools to describe your API and expose \
its documentation properly using Swagger."
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python314-flask-restx-1.3.2-1.2.noarch.rpm"
RPM_HASH = "fe4b3e4ff432ddcbd190283fd1867cb2127d3cc37d31fb24819d6952fe7674747ca476964bd693ee04484a27f3b8919d165864fb7bb34a1fe365b71a3d61b5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-restx \
python314-flask-restx \
python3dist-flask-restx"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Werkzeug \
python314-aniso8601 \
python314-jsonschema \
python314-referencing"

inherit rpm
