SUMMARY = "Extra bits for Python"
DESCRIPTION = "extras is a set of extensions to the Python standard library, originally \
written to make the code within testtools cleaner, but now split out for \
general use outside of a testing context."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-extras-1.0.0-8.3.noarch.rpm"
RPM_HASH = "9c800a153b5984e1400467ad17bbd1634065322c90a07064036f19167e97dc89a9c74d4a95453ec4e4abef1f274d8f9c1f2e3647ad9cee26c7a219cbf503270e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-extras \
python314-extras \
python3dist-extras"

RDEPENDS:${PN} += "python-abi"

inherit rpm
