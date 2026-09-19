SUMMARY = "ZSH Completion for bspwm"
DESCRIPTION = "ZSH completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.12"

RPM_NAME = "bspwm-zsh-completion-0.9.12-1.5.noarch.rpm"
RPM_HASH = "73d428861dd769c89ed6c5cfd453cd7c25ddd82d784476cf675ace9f9f871c53ca41f3dc2af34999e66d136770dc9aaa6f12ec286df17c0f314ad5cc233850d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-zsh-completion"

RDEPENDS:${PN} += "bspwm"

inherit rpm
