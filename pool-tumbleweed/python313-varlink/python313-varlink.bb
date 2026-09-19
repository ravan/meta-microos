SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python313-varlink-31.0.0-2.12.noarch.rpm"
RPM_HASH = "6903a5a5cc79462a0bd6e1cab67611dc585f938f733d7defa22082cf512b47d1a654d1d61fdcab3097446240980d946485705d78706b2b9a8aa579c1fe0950a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varlink \
python3.13dist-varlink \
python313-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi"

inherit rpm
