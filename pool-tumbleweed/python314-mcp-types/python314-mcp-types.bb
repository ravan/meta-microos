SUMMARY = "Model Context Protocol wire types"
DESCRIPTION = "The wire types for the Model Context Protocol: the protocol message models, \
JSON-RPC envelope types, per-version surface validators and the protocol \
version registry. Its only runtime dependencies are pydantic and \
typing-extensions, so MCP traffic can be (de)serialized without pulling in the \
full mcp SDK."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-mcp-types-2.2.0-1.1.noarch.rpm"
RPM_HASH = "78406a14fa62f39f474b39f2d8431593f317a7bf06468b7ed40acb2677d1c01752ceddc86b0847d206cb64327a8c23af086c12ed42a28baf99e5d59df4041729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mcp-types \
python314-mcp-types \
python3dist-mcp-types"

RDEPENDS:${PN} += "python-abi \
python314-pydantic \
python314-typing-extensions"

inherit rpm
