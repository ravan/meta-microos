SUMMARY = "A Python library for building configuration shells"
DESCRIPTION = "configshell-fb is a Python library that provides a framework for building simple \
but nice CLI-based applications. \
 \
configshell-fb is a fork of the 'configshell' code written by RisingTide \
Systems. The '-fb' differentiates between the original and this version. Please \
ensure to use either all 'fb' versions of the targetcli components -- targetcli, \
rtslib, and configshell, or stick with all non-fb versions, since they are \
no longer strictly compatible."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "python313-configshell-fb-2.0.0-2.6.noarch.rpm"
RPM_HASH = "194951520060b594a7f6f3c190ec3322e6ebec6ead80d48563a6e6ed34b7cc0829d09170788faf78a12c9058eca87d11a071fec45316ac00eb0ac1d069f8b2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-configshell \
python3-configshell-fb \
python3.13dist-configshell-fb \
python313-configshell \
python313-configshell-fb \
python3dist-configshell-fb"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python313-pyparsing"

inherit rpm
