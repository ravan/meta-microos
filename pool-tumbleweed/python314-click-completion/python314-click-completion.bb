SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python314-click-completion-0.5.2-2.5.noarch.rpm"
RPM_HASH = "ac122ae969167bbaab4de6755f62522d362f757f73c32dc75f19c9599d301d5b2b99ba0382323f79a929f8f7661230e75432d3124cf8af647744f6917215b5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-completion \
python314-click-completion \
python3dist-click-completion"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-click \
python314-shellingham \
python314-six"

inherit rpm
