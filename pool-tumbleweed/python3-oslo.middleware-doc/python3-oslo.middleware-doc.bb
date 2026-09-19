SUMMARY = "Documentation for OpenStack middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python3-oslo.middleware-doc-8.1.0-1.2.noarch.rpm"
RPM_HASH = "f93b2fe296279f86ddfdb44e077df21ec9246296bc0dec3754ea7258c41c3c07a0daf6c1ffcdaf3e4df67f2e01504c4b78e9b59cc3a7a973616f98a78eb25338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.middleware-doc"

RDEPENDS:${PN} += ""

inherit rpm
