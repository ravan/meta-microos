SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "python314-javapackages-6.5.1-3.2.noarch.rpm"
RPM_HASH = "3176582c268bba65516ab32ee610d26ebb50eefc6e520a41a5a9daa8c0f2be0cfb6c14ee5881c67423f484eff8e51cff81088896c20e450e5fe9dbcba61a6792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-javapackages \
python314-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python314-lxml \
python314-xml"

inherit rpm
