SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.4.1"

RPM_NAME = "python314-h2-4.4.1-1.1.noarch.rpm"
RPM_HASH = "94e24e6d0ee1604328f150e7385ba3ba651123345848cb94dfb41c95900f6d342b40d5fd5a281da2605152c5df8ecfb9cd2cd0f6fc2563e12385749128269d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-h2 \
python314-h2 \
python3dist-h2"

RDEPENDS:${PN} += "python-abi \
python314-hpack \
python314-hyperframe"

inherit rpm
