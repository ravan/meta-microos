SUMMARY = "OpenStack Docs Tools"
DESCRIPTION = "Tools used by the OpenStack Documentation Project. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.0.3"

RPM_NAME = "python3-openstack-doc-tools-4.0.3-1.2.noarch.rpm"
RPM_HASH = "829aa3ae646dd17c3d0bab606e3f61f2c82ace45808e5ec8bc5a6e994c2398b2eb6770e44741d2dcefeeea89f5c57c3358c0f5f2300170667ffd85dce09cc8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstack-doc-tools \
python3.13dist-openstack-doc-tools \
python3dist-openstack-doc-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python3-PyYAML \
python3-Sphinx \
python3-iso8601 \
python3-lxml \
python3-openstackdocstheme"

inherit rpm
