SUMMARY = "The fast, Pythonic way to build MCP servers and clients"
DESCRIPTION = "FastMCP is the fast, Pythonic way to build Model Context Protocol (MCP) \
servers and clients. This is the full distribution, pulling in fastmcp-slim \
with the client and server integrations enabled; the importable 'fastmcp' \
module is provided by fastmcp-slim."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "python313-fastmcp-3.4.7-1.1.noarch.rpm"
RPM_HASH = "a41ff12a56dc32c2a355b6624e4560e21bcf663fcea58f9ddd5d4f1aa12991e145cdaae3b819359482d76a34e9caaf672824851cffa0502020c6a491557dbcd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastmcp \
python3.13dist-fastmcp \
python313-fastmcp \
python3dist-fastmcp"

RDEPENDS:${PN} += "python313-fastmcp-slim"

inherit rpm
