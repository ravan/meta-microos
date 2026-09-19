SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.70"

RPM_NAME = "python314-construct-2.10.70-2.10.noarch.rpm"
RPM_HASH = "e6bec35c3f79faec9636b0e3f7dab8e9236d97ceea19c13e40f4ad2923fee808b2312916294852004b719add01d97a5874fae357e82f03628de193dc5bf932ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-construct \
python314-construct \
python3dist-construct"

RDEPENDS:${PN} += "python-abi \
python314-arrow"

inherit rpm
