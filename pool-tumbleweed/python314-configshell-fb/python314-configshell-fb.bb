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

RPM_NAME = "python314-configshell-fb-2.0.0-2.6.noarch.rpm"
RPM_HASH = "e8a883c2b289a62d56de907610d1f8920c623609aeb44514790665be49292d6e7b104055cabea7e0882b639a34b79b5544a11064fabb4fa19db42e7a928fb8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-configshell-fb \
python314-configshell \
python314-configshell-fb \
python3dist-configshell-fb"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python314-pyparsing"

inherit rpm
