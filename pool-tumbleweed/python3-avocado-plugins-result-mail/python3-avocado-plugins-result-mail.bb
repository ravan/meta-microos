SUMMARY = "Avocado plugin to send job results by e-mail"
DESCRIPTION = "This optional plugin sends a notification e-mail with the Avocado job \
results once a job finishes."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-result-mail-113.0-1.2.noarch.rpm"
RPM_HASH = "da6e1658db5722ef37d05c6d4b5558dbb9248ba51e0349842cb5489e158bf07445a112e13d82dd571dd2a7f4b8b185b6fb0cdfefe3f074603836e35a948d3ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-result-mail \
python3.13dist-avocado-framework-plugin-result-mail \
python3dist-avocado-framework-plugin-result-mail"

RDEPENDS:${PN} += "python-abi \
python3-avocado"

inherit rpm
