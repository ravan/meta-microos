SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python314-sphinxcontrib-blockdiag-3.0.0-4.5.noarch.rpm"
RPM_HASH = "0d070ef82fc80a46c5afc8b2ccafd6e16c2662d0c36a7791a3c427a13309ddcf6d77ce8b707e3c1228a4ad4ddc4e9a3e466e97e1fc17e3ff563233fc89a83d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-blockdiag \
python314-sphinxcontrib-blockdiag \
python3dist-sphinxcontrib-blockdiag"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-blockdiag"

inherit rpm
