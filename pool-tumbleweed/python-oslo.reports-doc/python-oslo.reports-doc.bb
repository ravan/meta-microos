SUMMARY = "Documentation for OpenStack reports library"
DESCRIPTION = "The project oslo.reports hosts a general purpose error report generation \
framework, known as the 'guru meditation report'. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.9.0"

RPM_NAME = "python-oslo.reports-doc-3.9.0-1.1.noarch.rpm"
RPM_HASH = "4c95af7e1cf5e21f45f84148c05589ddac07f79b70bcca87982b228b2183ce11d78c256332090fec4e1fd1c33a5a03f3335407d70a0eebdf36ceee4d641dcefa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.reports-doc"

RDEPENDS:${PN} += ""

inherit rpm
