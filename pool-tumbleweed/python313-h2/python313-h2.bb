SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.4.1"

RPM_NAME = "python313-h2-4.4.1-1.1.noarch.rpm"
RPM_HASH = "5353b2cbb61cfd32c024ef8239a768253603ac4d26550f2735dfd487cf0e3d3172a247a21db229a54464a876019d7bf09ac6b4f4c2f6b2b824a1dec77f736395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h2 \
python3.13dist-h2 \
python313-h2 \
python3dist-h2"

RDEPENDS:${PN} += "python-abi \
python313-hpack \
python313-hyperframe"

inherit rpm
