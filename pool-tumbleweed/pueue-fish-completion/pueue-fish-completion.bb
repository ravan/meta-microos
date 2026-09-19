SUMMARY = "Fish Completion for pueue"
DESCRIPTION = "The official fish completion script for pueue."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "pueue-fish-completion-3.4.1-1.12.noarch.rpm"
RPM_HASH = "ca4b960abae126729bf854f53475400e8357987c1dbfd376e0a8716421b7e407026fe50e39f26e070aa8294a39faf391ab5b8e75da86ac73c4c8c5dc09b22da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pueue-fish-completion"

RDEPENDS:${PN} += "pueue"

inherit rpm
