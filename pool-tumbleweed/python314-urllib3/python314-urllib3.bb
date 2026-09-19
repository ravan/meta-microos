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

RPM_NAME = "python314-urllib3-2.7.0-2.3.noarch.rpm"
RPM_HASH = "0b68bd7dc989be860e9a6151b0d5ac87ff8f0ec2ebf95b704f82b7f20915221e329725a09f12ac080098a4d7be0ada4073ad7da6c19a1ee7e2c675a32c443454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urllib3 \
python314-urllib3 \
python3dist-urllib3"

RDEPENDS:${PN} += "ca-certificates-mozilla \
python-abi"

inherit rpm
