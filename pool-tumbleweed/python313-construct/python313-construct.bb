SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.70"

RPM_NAME = "python313-construct-2.10.70-2.10.noarch.rpm"
RPM_HASH = "8fb4f5c8753dcdb29dd654fe00928b8c4f2e4718534e16c7f4a1df1f40f8dcb128f22eb1fb27c37dc6cc753c7caa6c6cf5e8a5c335278ebe96bf8620afe22bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-construct \
python3.13dist-construct \
python313-construct \
python3dist-construct"

RDEPENDS:${PN} += "python-abi \
python313-arrow"

inherit rpm
