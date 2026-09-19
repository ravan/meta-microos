SUMMARY = "Minimal terminal coding agent"
DESCRIPTION = "pi is a terminal coding agent. It runs in interactive, print/JSON, and RPC \
modes, and can be embedded in other applications through its SDK. \
 \
It is extended with TypeScript extensions, skills, prompt templates and \
themes rather than by forking it, and those extensions are distributed as \
pi packages via npm or git."
LICENSE = "0BSD & Apache-2.0 & BSD-3-Clause & BlueOak-1.0.0 & ISC & MIT & Unlicense"

PV = "0.85.1"

RPM_NAME = "pi-coding-agent-0.85.1-1.1.noarch.rpm"
RPM_HASH = "e54620c60b6a18d389de2cd46bb1c4aba019b4e33202fcbbff501171e86664a00332835466df3672615e3ac9bba3f10231b44d11938e4f23bc2a1a6872d99903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled-highlight.js \
bundled-marked \
pi-coding-agent"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs"

inherit rpm
