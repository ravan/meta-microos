SUMMARY = "Model Context Protocol wire types"
DESCRIPTION = "The wire types for the Model Context Protocol: the protocol message models, \
JSON-RPC envelope types, per-version surface validators and the protocol \
version registry. Its only runtime dependencies are pydantic and \
typing-extensions, so MCP traffic can be (de)serialized without pulling in the \
full mcp SDK."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-mcp-types-2.2.0-1.1.noarch.rpm"
RPM_HASH = "44f42e470adf2b20d019b3ea9d7ff3b103961ff6701d72c6b583a58d528d18efcac049acff0438f05bc6389c989f62f6ea5868a7de4aa4c97bd3513a70c9e9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mcp-types \
python3.13dist-mcp-types \
python313-mcp-types \
python3dist-mcp-types"

RDEPENDS:${PN} += "python-abi \
python313-pydantic \
python313-typing-extensions"

inherit rpm
