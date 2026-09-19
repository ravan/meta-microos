SUMMARY = "An AI agent that brings the power of Gemini directly into your terminal"
DESCRIPTION = "Gemini CLI is an open-source AI agent that brings the power of Gemini directly \
into your terminal. It provides lightweight access to Gemini, giving you the \
most direct path from your prompt to our model. \
 \
* Free tier: 60 requests/min and 1,000 requests/day with personal Google account. \
* Powerful Gemini 3 Pro: Access to 1M token context window. \
* Built-in tools: Google Search grounding, file operations, shell commands, web fetching. \
* Extensible: MCP (Model Context Protocol) support for custom integrations. \
* Terminal-first: Designed for developers who live in the command line. \
* Open source: Apache 2.0 licensed."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "gemini-cli-0.59.0-1.1.noarch.rpm"
RPM_HASH = "12ffca0fbd2a67e71a23af211bb8ab522ecd47780ba04c13de6730572397d9d444eebbb383a05e8f34f92f29d5af33734569fdafc753556c7e8737695b5ad206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gemini-cli"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/node \
git-core \
grep \
gzip \
tar \
xsel \
zstd"

inherit rpm
