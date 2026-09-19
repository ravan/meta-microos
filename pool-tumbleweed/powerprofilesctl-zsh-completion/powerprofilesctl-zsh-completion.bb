SUMMARY = "Zsh shell completion for powerprofilesctl"
DESCRIPTION = "This package provides zsh shell completions for powerprofilesctl."
LICENSE = "GPL-3.0-or-later"

PV = "0.30"

RPM_NAME = "powerprofilesctl-zsh-completion-0.30-1.7.noarch.rpm"
RPM_HASH = "5cfa9adcc6f9bc5df5a9aebac25b0db2c815cad7181f3ca8a6e7711462be80708de63644a109395d4485ea0da929ff61cd08319246740721545672cfb512923b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerprofilesctl-zsh-completion"

RDEPENDS:${PN} += "power-profiles-daemon \
zsh"

inherit rpm
