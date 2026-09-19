SUMMARY = "Documentation for texlive-bbcard"
DESCRIPTION = "This package includes the documentation for texlive-bbcard"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn19440"

RPM_NAME = "texlive-bbcard-doc-2026.226.svn19440-60.2.noarch.rpm"
RPM_HASH = "f1956711354bb861ecb4ab1efe49f70c7f46e182d04821206e6d6032b380290411bcf8aec07ec96db77616425a9796785998e3cab84a7703cec6a98219ae1c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
