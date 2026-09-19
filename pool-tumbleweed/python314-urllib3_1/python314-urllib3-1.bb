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

RPM_NAME = "python314-urllib3_1-1.26.20-7.2.noarch.rpm"
RPM_HASH = "785195332fb560c86d465c16be3f56bcb391d8d60e828c050708b67c434147fce8e63db334919c238bb84a1f476e32b2ae3af56c01989d730ee152b6eaba8f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urllib3 \
python314-urllib3 \
python314-urllib3-1 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi \
python314-certifi \
python314-cryptography \
python314-idna \
python314-pyOpenSSL \
python314-six"

inherit rpm
