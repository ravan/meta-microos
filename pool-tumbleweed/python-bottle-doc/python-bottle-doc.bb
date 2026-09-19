SUMMARY = "Documentation for python-bottle"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library. \
 \
This subpackage contains the PDF documentation for python-bottle."
LICENSE = "MIT"

PV = "0.13.4"

RPM_NAME = "python-bottle-doc-0.13.4-3.5.noarch.rpm"
RPM_HASH = "b9d63f454b5c438429dc014045eb067b5bf421f58d6a5f026b926310bf02b1e2b5bfda6ec1d743bb96e2865780df82f789142ba66511ab98814694633edbef59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bottle-doc \
python313-bottle-doc \
python314-bottle-doc"

RDEPENDS:${PN} += ""

inherit rpm
