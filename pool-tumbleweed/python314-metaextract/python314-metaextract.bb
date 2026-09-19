SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python314-metaextract-1.0.9-3.9.noarch.rpm"
RPM_HASH = "1dd777fe1f34dce6ec1d6cb15b3340696f14a8d47ea315bda0d3596edc48a2e059355f39d3beca4828b7159ee599b364c7bb118758e233d1dc795af1c6f313e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-metaextract \
python314-metaextract \
python3dist-metaextract"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
