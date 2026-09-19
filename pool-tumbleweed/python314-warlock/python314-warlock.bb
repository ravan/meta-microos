SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-warlock-2.1.0-1.4.noarch.rpm"
RPM_HASH = "fa6d60e4f8f69c8dbbee5c46692a57cf2f482cb822ec651d58b0573b9fff86545f4706052d251a66335a4d1313ba8ab09b8fb194ec038b84d7757dabfd8678b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-warlock \
python314-warlock \
python3dist-warlock"

RDEPENDS:${PN} += "python-abi \
python314-jsonpatch \
python314-jsonschema"

inherit rpm
