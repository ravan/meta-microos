SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python313-pname-1.0.2-2.5.noarch.rpm"
RPM_HASH = "1a63ff24535acebc8c5bc5011bf983483bb84dcef5027ba9e72c3545136aa07a326c128f4af5aa98b78b5bcddd475584dc25f2ef0582afc1828dd811e209d2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pname \
python3.13dist-pname \
python313-pname \
python3dist-pname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
