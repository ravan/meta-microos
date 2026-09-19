SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python313-click-completion-0.5.2-2.5.noarch.rpm"
RPM_HASH = "d7bf8c4849a3dd318ba88a51759442d9df0d01f897cbf5072c01d55cb4d696a111d49f562f5b8ac9bc6ea2638316e9868c5e0bb74b8fdc975423a9089ff21018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-completion \
python3.13dist-click-completion \
python313-click-completion \
python3dist-click-completion"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-click \
python313-shellingham \
python313-six"

inherit rpm
