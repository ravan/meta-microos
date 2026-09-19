SUMMARY = "Fish completion for wl-clipboard"
DESCRIPTION = "Fish command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.3.0"

RPM_NAME = "wl-clipboard-fish-completion-2.3.0-1.3.noarch.rpm"
RPM_HASH = "b9fb9546a296ac63fe15ef75bff5b3b29570c57b071b65d21fc4c8eb7c2de9002470902c1194e792bb71d56b8c739ad60a46e6c73f3064f9b0a54d29fcec2232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-fish-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
