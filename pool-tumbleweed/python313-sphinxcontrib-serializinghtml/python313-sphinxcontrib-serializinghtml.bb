SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-serializinghtml-2.0.0-1.2.noarch.rpm"
RPM_HASH = "72cfae06901bd8e2e398cee479ddfd1571135e06261063d1726090a150b88758a77fb6f044562aad8cd92dd1ab52325a1a16bc9eb04dc71fffdd338137a73136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-serializinghtml \
python3.13dist-sphinxcontrib-serializinghtml \
python313-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
