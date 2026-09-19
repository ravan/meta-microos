SUMMARY = "Fish Completion for alacritty"
DESCRIPTION = "The official fish completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "alacritty-fish-completion-0.17.0-1.5.noarch.rpm"
RPM_HASH = "e9cb25c648df9283cfec2a5689703e99a2a9978aab9ce312d90939908b563cb0fba53acce342e55724cfbe0313ff281739db9a7c5df9b180b7f37a975b18d4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
