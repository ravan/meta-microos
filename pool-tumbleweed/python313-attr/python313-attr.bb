SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python313-attr-0.3.2-3.5.noarch.rpm"
RPM_HASH = "ec0adcd0895c1a0c66a83000a94bc09fbbc27397df5fa4617af9296df3eca32fc718a102a811af31acbb286269ffdcb4205a4134cdf06802193f585172e17ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attr \
python3.13dist-attr \
python313-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
