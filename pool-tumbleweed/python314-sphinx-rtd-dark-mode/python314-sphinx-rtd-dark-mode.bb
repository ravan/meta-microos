SUMMARY = "Dark mode for the Sphinx Read the Docs theme"
DESCRIPTION = "Dark mode for the Sphinx Read the Docs theme."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-sphinx-rtd-dark-mode-1.3.0-1.2.noarch.rpm"
RPM_HASH = "53b29e8d0382cb4bd5ca6dc7ff7b777942978d4834c318917e089f5ec9464212b9972aa913498fc90753e418f2dd945015f4cc12410d311a408f136bc2070682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-rtd-dark-mode \
python314-sphinx-rtd-dark-mode \
python3dist-sphinx-rtd-dark-mode"

RDEPENDS:${PN} += "python-abi \
python314-sphinx-rtd-theme"

inherit rpm
