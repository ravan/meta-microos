SUMMARY = "Applications for the Python acitoolkit library"
DESCRIPTION = "Python applications using acitoolkit for programming ACI."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-applications-0.4-8.8.noarch.rpm"
RPM_HASH = "32950281bd6791c5228f5bef48d2dc0ac5554d3e6544e0a1484d3f63ebb8ee271d0bfe156d858816351ce0e1e6ccd3847b4093512fddbb0203bdf57aee5ee1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc-applications"

RDEPENDS:${PN} += "python-acitoolkit-doc \
python3-Flask \
python3-Flask-Admin \
python3-Flask-Bootstrap \
python3-Flask-Cors \
python3-Flask-HTTPAuth \
python3-Flask-SQLAlchemy \
python3-Flask-WTF \
python3-GitPython \
python3-py-radix"

inherit rpm
