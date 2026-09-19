SUMMARY = "A python interface to Last.fm"
DESCRIPTION = "A Python interface to Last.fm and other API-compatible websites such as Libre.fm \
 \
Features: \
- Simple public interface. \
- Access to all the data exposed by the Last.fm webservices. \
- Scrobbling support. \
- Full object-oriented design. \
- Proxy support. \
- Internal caching support for some webservices calls (disabled by default). \
- No extra dependencies but python itself. \
- Support for other API-compatible networks like Libre.fm \
- Python3-friendly (Starting from 0.5)."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "python314-pylast-5.5.0-1.7.noarch.rpm"
RPM_HASH = "cc9b93f75d8aaa1115c01e5919aedd839a07968490419e29b0a29898fce560f050bfe1d4014b9a728dac42f44c2a9971b33ea513dd164051bb552c893978936e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylast \
python314-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi \
python314-httpx"

inherit rpm
