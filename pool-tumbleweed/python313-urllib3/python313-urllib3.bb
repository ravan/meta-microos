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

PV = "2.7.0"

RPM_NAME = "python313-urllib3-2.7.0-2.3.noarch.rpm"
RPM_HASH = "d5cb1fbd80875cbd0aa4de01771f92fc76767e6a55c0e84c942796c399ef7dcf77593342a6e22178befcec72e6cc50e44e96bc738a77a7110c8585c975480428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urllib3 \
python3.13dist-urllib3 \
python313-urllib3 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi"

inherit rpm
