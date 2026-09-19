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

RPM_NAME = "python313-pylast-5.5.0-1.7.noarch.rpm"
RPM_HASH = "cf4a6daea003a78ab2810200286c23ad8e50de8b1cf780608959131893afdddf0198e72713a59970511482a59419695518e78bbdbaa4c1e8792f4f14dd07b1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylast \
python3.13dist-pylast \
python313-pylast \
python3dist-pylast"

RDEPENDS:${PN} += "python-abi \
python313-httpx"

inherit rpm
