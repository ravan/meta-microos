SUMMARY = "Sample code for the Python acitoolkit library"
DESCRIPTION = "Python samples for using acitoolkit for programming ACI."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-samples-0.4-8.8.noarch.rpm"
RPM_HASH = "df4803c2f2d3f8c45655e84aef5100793c1fd4b2b881f63d42d2d1caa25fdaded72e188c8965d8ef917f77e7b62dbbdb3e81426e2616a0e03f248ef9a78b151e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc-samples"

RDEPENDS:${PN} += "python-acitoolkit-doc \
python3-PyMySQL"

inherit rpm
