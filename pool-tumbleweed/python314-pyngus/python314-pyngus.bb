SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python314-pyngus-2.3.1-2.5.noarch.rpm"
RPM_HASH = "b17f5f4bf5765381b963ab3dbd32dde7a9d869bae5cc67e5ba438a7148f062f29ff4e5d1a31c3464e3fd0e5a7ff05953d020aab26d423c310afd94e32a3f7481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyngus \
python314-pyngus \
python3dist-pyngus"

RDEPENDS:${PN} += "python-abi \
python314-python-qpid-proton"

inherit rpm
