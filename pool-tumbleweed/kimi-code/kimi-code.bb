SUMMARY = "Command-line agentic coding assistant powered by Kimi models"
DESCRIPTION = "Kimi Code is Moonshot AI's command-line coding agent: an interactive terminal \
assistant for software-engineering tasks, driven by the Kimi family of models. \
 \
It bundles a prebuilt web dashboard and shells out to ripgrep and fd for fast \
code search. The interactive shell backend is provided by a compiled node-pty \
addon."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "kimi-code-0.42.0-1.1.aarch64.rpm"
RPM_HASH = "1ccc582dd137f7a9c14f05b0542b67e324f2533217598e91c03aa7e6cc04146e330a48aefa3c8c7b8cd38a4faa9d4d4180e94948de284564278c99f846508984"

RPROVIDES:${PN} += "bundled-dijkstrajs \
bundled-node-addon-api \
bundled-node-pty \
bundled-pngjs \
bundled-qrcode \
bundled-ws \
kimi-code"

RDEPENDS:${PN} += "/usr/bin/node \
fd \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
nodejs \
ripgrep"

inherit rpm
