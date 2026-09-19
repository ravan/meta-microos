SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more"
DESCRIPTION = "Highlights \
 \
- Re-use the same socket connection for multiple requests \
  (HTTPConnectionPool and HTTPSConnectionPool) \
  (with optional client-side certificate verification). \
- File posting (encode_multipart_formdata). \
- Built-in redirection and retries (optional). \
- Supports gzip and deflate decoding. \
- Thread-safe and sanity-safe. \
- Works with AppEngine, gevent, and eventlib. \
- Tested on Python 2.6+ and Python 3.3+, 100% unit test coverage. \
- Small and easy to understand codebase perfect for extending and building upon. \
  For a more comprehensive solution, have a look at \
  Requests which is also powered by urllib3."
LICENSE = "MIT"

PV = "1.26.20"

RPM_NAME = "python313-urllib3_1-1.26.20-7.2.noarch.rpm"
RPM_HASH = "20280b0155898b7ad7ac4dd438e4ab002c3eecc4ce76d0f4a0f7f20b5fc3745f35da5b9ae9a2d93ed9b751d7ea6485ded2a91ca5eac3c5be1ddf6e3dcf460849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 \
python3-urllib3-1 \
python3.13dist-urllib3 \
python313-urllib3 \
python313-urllib3-1 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python313-certifi \
python313-cryptography \
python313-idna \
python313-pyOpenSSL \
python313-six"

inherit rpm
