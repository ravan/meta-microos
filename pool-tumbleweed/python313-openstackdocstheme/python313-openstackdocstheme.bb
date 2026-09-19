SUMMARY = "OpenStack Docs Theme"
DESCRIPTION = "Theme and extension support for Sphinx documentation that is published \
to docs.openstack.org. Intended for use by OpenStack projects."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python313-openstackdocstheme-3.6.0-1.2.noarch.rpm"
RPM_HASH = "b5a428a08bcb3bed15392855c27e03df61e81b696ce762ffb604a86467c80fee75a6acbe27586d9a82be21f676df27dc890e05c929df3c30f0ad6502d49cbee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openstackdocstheme \
python3.13dist-openstackdocstheme \
python313-openstackdocstheme \
python3dist-openstackdocstheme"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python313-Sphinx \
python313-dulwich"

inherit rpm
