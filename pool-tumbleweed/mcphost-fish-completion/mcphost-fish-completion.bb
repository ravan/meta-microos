SUMMARY = "Fish Completion for mcphost"
DESCRIPTION = "The official fish completion script for mcphost, generated during the build."
LICENSE = "MIT & Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.34.0"

RPM_NAME = "mcphost-fish-completion-0.34.0-10.1.noarch.rpm"
RPM_HASH = "af94d337658d0458a1eadbba81c7f1ab7ca80a9b3fb24e6f3e1229cd2f3a2a5e02f245249942e99b10d9d7d21075c08124615f767b50313f0b2d0c335b9390ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcphost-fish-completion"

RDEPENDS:${PN} += "mcphost"

inherit rpm
