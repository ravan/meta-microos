SUMMARY = "Module to collect metadata for Python modules"
DESCRIPTION = "metaextract is a tool to collect metadata about a python module. For \
example, it can determine and collect the dependencies of a sdist \
tarball that was retrieved from the Python Package Index. \
 \
The tool was first developed in py2pack but is now its own module."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python313-metaextract-1.0.9-3.9.noarch.rpm"
RPM_HASH = "8019749c7e73100de615604deb5d71a03b53e98eec695406796a9d8473f678229059d0a4e7581763118d6dc0105f23c3346086d0b8cd618ec03a4751fe940269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-metaextract \
python3.13dist-metaextract \
python313-metaextract \
python3dist-metaextract"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
