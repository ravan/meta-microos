SUMMARY = "Documentation for OpenStack Cinder API Client"
DESCRIPTION = "This is a client for the OpenStack Cinder API (Block Storage. There's a \
Python API (the cinderclient module), and a command-line script (cinder). \
Each implements 100% of the OpenStack Cinder API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "9.10.0"

RPM_NAME = "python-cinderclient-doc-9.10.0-1.1.noarch.rpm"
RPM_HASH = "408e7c666c9dd3437f7872241212666b4c9877e8c94b89f31cd0420e2cd085a878db8f32a3158abeee893290616b216cb9a49d6964f616ab27f26b4ffcbb8f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-cinderclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
