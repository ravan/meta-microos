SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python313-knack-0.14.0-1.2.noarch.rpm"
RPM_HASH = "6b9eabd431e888186d1d68452222b104883708e738bd14ccda503af34fdcc81600637064a1289b237ae319e2871c50e011bda54361c5c77bf62e287fc1881551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-knack \
python3.13dist-knack \
python313-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-argcomplete \
python313-jmespath \
python313-pygments \
python313-tabulate"

inherit rpm
