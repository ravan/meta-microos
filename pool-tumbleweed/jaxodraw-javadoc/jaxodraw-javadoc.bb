SUMMARY = "Javadocs for jaxodraw"
DESCRIPTION = "This package contains the API documentation for jaxodraw."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "jaxodraw-javadoc-2.1.0-7.10.noarch.rpm"
RPM_HASH = "85f387def1e212853317efd13e3e9553dfcc9779f5f2a5aa8860899c31b5bb0bef23b4479e3a90ecd20ab8f6518638b992ef735cdbde98ab83493348809a77cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxodraw-javadoc"

RDEPENDS:${PN} += "javapackages-tools \
jaxodraw"

inherit rpm
