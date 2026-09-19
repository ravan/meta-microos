SUMMARY = "Fish Completion for hyprland"
DESCRIPTION = "The official fish completion script for hyprland."
LICENSE = "BSD-3-Clause"

PV = "0.56.2"

RPM_NAME = "hyprland-fish-completion-0.56.2-1.2.noarch.rpm"
RPM_HASH = "1e2a15fbc7369710e172151ff0822404049ccb801adf4e3f76a3f6c0d6da5b40d41e3901c9eb93779da46a69c944391625213e465f99b2cf4ea3e5fa692ec684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprland-fish-completion"

RDEPENDS:${PN} += "awk \
fish \
hyprland"

inherit rpm
