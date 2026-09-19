SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python314-sphinx-click-6.2.0-1.3.noarch.rpm"
RPM_HASH = "e1c564f281db85ecb7cad09a1410a470bc51d3e4a8d0273444ad574f872fe004db90dc5a49f002ef2ca4149dc1e6466bb904daa94100beb02391925227f67e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-click \
python314-sphinx-click \
python3dist-sphinx-click"

RDEPENDS:${PN} += "python-abi \
python3.14dist-click \
python3.14dist-docutils \
python3.14dist-sphinx"

inherit rpm
