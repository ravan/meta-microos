SUMMARY = "Fish Completion for go-passbolt-cli"
DESCRIPTION = "The official fish completion script for go-passbolt-cli, generated during the build."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "go-passbolt-cli-fish-completion-0.5.1-1.2.noarch.rpm"
RPM_HASH = "8bc155aab353f101b301c02471be7f7781bd41bbbde6cfdf354125526fcfcd70d5b1b94c392dda6aaa03a0397fe91dfa9b13807dc42c8b465c33046914e28d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "go-passbolt-cli-fish-completion"

RDEPENDS:${PN} += "go-passbolt-cli"

inherit rpm
